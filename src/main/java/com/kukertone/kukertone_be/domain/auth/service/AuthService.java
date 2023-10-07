package com.kukertone.kukertone_be.domain.auth.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kukertone.kukertone_be.domain.auth.dto.request.JoinRequestDto;
import com.kukertone.kukertone_be.domain.kid.entity.Kid;
import com.kukertone.kukertone_be.domain.kid.repository.KidRepository;
import com.kukertone.kukertone_be.domain.member.entity.Member;
import com.kukertone.kukertone_be.domain.member.repository.MemberRepository;
import com.kukertone.kukertone_be.domain.organization.entity.Organization;
import com.kukertone.kukertone_be.domain.organization.repository.OrganizationRepository;
import com.kukertone.kukertone_be.domain.volunteer.entity.Volunteer;
import com.kukertone.kukertone_be.domain.volunteer.repository.VolunteerRepository;
import com.kukertone.kukertone_be.error.ErrorCode;
import com.kukertone.kukertone_be.error.exception.custom.BusinessException;
import com.kukertone.kukertone_be.error.exception.custom.TokenException;
import com.kukertone.kukertone_be.jwt.service.JwtService;
import com.kukertone.kukertone_be.util.RedisUtil;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class AuthService {

    private final MemberRepository memberRepository;
    private final KidRepository kidRepository;
    private final VolunteerRepository volunteerRepository;
    private final OrganizationRepository organizationRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final RedisUtil redisUtil;

    public void join(JoinRequestDto joinRequestDto) {
        if (memberRepository.existsByEmail(joinRequestDto.email())) {
            throw new BusinessException(ErrorCode.ALREADY_EXIST_EMAIL);
        }

        Member member = joinRequestDto.toEntity();
        member.passwordEncode(passwordEncoder);
        //memberRepository.save(member);

        switch (member.getRole()){
            case Kid -> kidRepository.save(Kid.Kid()
                    .email(member.getEmail())
                    .name(member.getName())
                    .password(member.getPassword())
                    .role(member.getRole())
                .build());
            case Volunteer -> volunteerRepository.save(Volunteer.Volunteer()
                    .email(member.getEmail())
                    .name(member.getName())
                    .password(member.getPassword())
                    .role(member.getRole())
                .build());
            case Organization -> organizationRepository.save(Organization.Organization()
                .email(member.getEmail())
                .name(member.getName())
                .password(member.getPassword())
                .role(member.getRole())
                .build());

        }
    }

    public void logout(HttpServletRequest request) {
        log.info("logout 로직 호출");
        String accessToken = jwtService.extractAccessToken(request).orElseThrow(() -> new TokenException(ErrorCode.INVALID_TOKEN));
        String userId = jwtService.extractUserId(accessToken).orElseThrow(() -> new BusinessException(ErrorCode.MEMBER_NOT_FOUND));

        redisUtil.delete(userId);
        redisUtil.setBlackList(userId, accessToken, jwtService.getAccessTokenExpirationPeriod());
    }
}