package com.kukertone.kukertone_be.domain.organization.controller;

import com.kukertone.kukertone_be.domain.organization.dto.request.OrganizationRequest;
import com.kukertone.kukertone_be.domain.organization.dto.response.OrganizationListResponse;
import com.kukertone.kukertone_be.domain.organization.dto.response.OrganizationResponse;
import com.kukertone.kukertone_be.domain.organization.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/organization")
public class OrganizationController {
    private final OrganizationService organizationService;

    @GetMapping()
    public OrganizationListResponse getAll(){
        return organizationService.getAll();
    }

    @GetMapping("/{organizationId}")
    public OrganizationResponse get(@PathVariable Long organizationId){
        return organizationService.get(organizationId);
    }
}
