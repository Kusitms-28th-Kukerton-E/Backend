package com.kukertone.kukertone_be.domain.volunteer.repository;

import com.kukertone.kukertone_be.domain.volunteer.entity.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
}
