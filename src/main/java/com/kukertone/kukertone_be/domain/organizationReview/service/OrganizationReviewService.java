package com.kukertone.kukertone_be.domain.organizationReview.service;

import com.kukertone.kukertone_be.domain.organization.entity.Organization;
import com.kukertone.kukertone_be.domain.organization.repository.OrganizationRepository;
import com.kukertone.kukertone_be.domain.organizationReview.dto.request.OrganizationReviewRequest;
import com.kukertone.kukertone_be.domain.organizationReview.dto.response.OrganizationReviewListResponse;
import com.kukertone.kukertone_be.domain.organizationReview.dto.response.OrganizationReviewResponse;
import com.kukertone.kukertone_be.domain.organizationReview.entity.OrganizationReview;
import com.kukertone.kukertone_be.domain.organizationReview.repository.OrganizationReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrganizationReviewService {
    private final OrganizationReviewRepository organizationReviewRepository;

    public OrganizationReviewListResponse getAll() {
//        List<OrganizationReviewResponse> organizationReviewResponses = organizationReviewRepository.findAll().stream()
//                .map(OrganizationReviewResponse::new)
//                .collect(Collectors.toList());
//        return new OrganizationReviewListResponse(organizationReviewResponses);
        return null;
    }

    public OrganizationReviewResponse get(Long organizationReviewId) {
//        OrganizationReview organizationReview = organizationReviewRepository.findById(organizationReviewId)
//                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 게시글입니다"));
//        return new OrganizationReviewResponse(organizationReview);
        return null;
    }

    public void create(OrganizationReviewRequest organizationReviewRequest) {
//        OrganizationReview organizationReview = OrganizationReview.builder()
//                .title(organizationReviewRequest.getTitle())
//                .content(organizationReviewRequest.getContent())
//                .category(organizationReviewRequest.getCategory())
//                .organizationReview(null)//수정해야함
//                .build();
//        organizationReviewRepository.save(organizationReview);
    }

    @Transactional
    public void update(Long organizationReviewId, OrganizationReviewRequest organizationReviewRequest) {
//        OrganizationReview organizationReview = organizationReviewRepository.findById(organizationReviewId)
//                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다"));
//        organizationReview.update(organizationReviewRequest.getTitle(), organizationReviewRequest.getContent(), organizationReviewRequest.getCategory());
    }

    public void delete(Long organizationReviewId) {
//        OrganizationReview organizationReview = organizationReviewRepository.findById(organizationReviewId)
//                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다"));
//        organizationReviewRepository.delete(organizationReview);
    }
}
