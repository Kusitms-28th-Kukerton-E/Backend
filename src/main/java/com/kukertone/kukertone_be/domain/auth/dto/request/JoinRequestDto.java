package com.kukertone.kukertone_be.domain.auth.dto.request;

import com.kukertone.kukertone_be.domain.member.entity.Member;
import com.kukertone.kukertone_be.domain.member.entity.Role;

public record JoinRequestDto(String password, String email, String name, Role role) {
    public Member toEntity() {
        return Member.builder()
                .password(password)
                .email(email)
                .name(name)
                .role(role)
                .build();
    }
}
