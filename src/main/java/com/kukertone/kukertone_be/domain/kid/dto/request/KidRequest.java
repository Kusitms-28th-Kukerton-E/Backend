package com.kukertone.kukertone_be.domain.kid.dto.request;

import com.kukertone.kukertone_be.domain.kid.entity.Kid;
import com.kukertone.kukertone_be.domain.member.entity.Role;

public record KidRequest(String email, String name, String password, Role role) {

}
