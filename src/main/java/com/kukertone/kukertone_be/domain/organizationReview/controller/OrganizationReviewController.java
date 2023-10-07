package com.kukertone.kukertone_be.domain.organizationReview.controller;

import com.kukertone.kukertone_be.domain.organization.service.OrganizationService;
import com.kukertone.kukertone_be.domain.organizationReview.dto.request.OrganizationReviewRequest;
import com.kukertone.kukertone_be.domain.organizationReview.dto.response.OrganizationReviewListResponse;
import com.kukertone.kukertone_be.domain.organizationReview.dto.response.OrganizationReviewResponse;
import com.kukertone.kukertone_be.domain.organizationReview.service.OrganizationReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/organizationReview")
public class OrganizationReviewController {
    private final OrganizationReviewService organizationReviewService;

    @GetMapping()
    public OrganizationReviewListResponse getAll(){
        return organizationReviewService.getAll();
    }

    @GetMapping("/{organizationReviewId}")
    public OrganizationReviewResponse get(@PathVariable Long organizationReviewId){
        return organizationReviewService.get(organizationReviewId);
    }

    @PostMapping()
    public void create(@RequestBody OrganizationReviewRequest organizationReviewRequest){
        organizationReviewService.create(organizationReviewRequest);
    }

    @PutMapping("/{organizationReviewId}")
    public void update(@PathVariable Long organizationReviewId, @RequestBody OrganizationReviewRequest organizationReviewRequest){
        organizationReviewService.update(organizationReviewId, organizationReviewRequest);
    }

    @DeleteMapping("/{organizationReviewId}")
    public void delete(@PathVariable Long organizationReviewId){
        organizationReviewService.delete(organizationReviewId);
    }
}