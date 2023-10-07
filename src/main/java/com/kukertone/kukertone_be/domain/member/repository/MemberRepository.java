package com.kukertone.kukertone_be.domain.member.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kukertone.kukertone_be.domain.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	Boolean existsByEmail(String email);
	Optional<Member> findByEmail(String Email);
}
