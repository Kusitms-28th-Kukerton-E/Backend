package com.kukertone.kukertone_be.domain.member.entity;

import jakarta.persistence.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected Long id;

	protected String password;

	protected String email;

	protected String name;

	@Enumerated(EnumType.STRING)
	protected Role role;

	@Builder
	public Member(String password, String email, String name, Role role) {
		this.password = password;
		this.email = email;
		this.name = name;
		this.role = role;
	}

	public void passwordEncode(PasswordEncoder passwordEncoder) {
		this.password = passwordEncoder.encode(this.password);
	}
}
