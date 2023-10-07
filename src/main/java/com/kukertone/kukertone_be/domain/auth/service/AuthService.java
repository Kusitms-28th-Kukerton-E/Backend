package com.kukertone.kukertone_be.domain.auth.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kukertone.kukertone_be.domain.auth.dto.request.JoinRequestDto;
import com.kukertone.kukertone_be.domain.member.entity.Member;
import com.kukertone.kukertone_be.domain.member.repository.MemberRepository;
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
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final RedisUtil redisUtil;

    public void join(JoinRequestDto signUpRequestDto) {

        // if (memberRepository.existsByEmail(signUpRequestDto.userId())) {
        //     throw new BusinessException(ErrorCode.ALREADY_EXIST_USERID);
        // }

        if (memberRepository.existsByEmail(signUpRequestDto.email())) {
            throw new BusinessException(ErrorCode.ALREADY_EXIST_EMAIL);
        }

        Member member = signUpRequestDto.toEntity();
        member.passwordEncode(passwordEncoder);
        memberRepository.save(member);
    }

    public void logout(HttpServletRequest request) {
        log.info("logout 로직 호출");
        String accessToken = jwtService.extractAccessToken(request).orElseThrow(() -> new TokenException(ErrorCode.INVALID_TOKEN));
        String userId = jwtService.extractUserId(accessToken).orElseThrow(() -> new BusinessException(ErrorCode.MEMBER_NOT_FOUND));

        redisUtil.delete(userId);
        redisUtil.setBlackList(userId, accessToken, jwtService.getAccessTokenExpirationPeriod());
    }
}