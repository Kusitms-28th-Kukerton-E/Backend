package com.kukertone.kukertone_be.domain.organization.repository;

import com.kukertone.kukertone_be.domain.organization.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization,Long> {
}
