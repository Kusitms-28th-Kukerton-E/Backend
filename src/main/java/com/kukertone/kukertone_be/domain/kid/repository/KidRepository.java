package com.kukertone.kukertone_be.domain.kid.repository;

import com.kukertone.kukertone_be.domain.kid.entity.Kid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KidRepository extends JpaRepository<Kid,Long> {
}
