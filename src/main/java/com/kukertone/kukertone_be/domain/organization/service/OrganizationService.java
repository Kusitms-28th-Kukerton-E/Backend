package com.kukertone.kukertone_be.domain.organization.service;

import com.kukertone.kukertone_be.domain.article.dto.request.ArticleRequest;
import com.kukertone.kukertone_be.domain.article.dto.response.ArticleListResponse;
import com.kukertone.kukertone_be.domain.article.dto.response.ArticleResponse;
import com.kukertone.kukertone_be.domain.article.entity.Article;
import com.kukertone.kukertone_be.domain.article.repository.ArticleRepository;
import com.kukertone.kukertone_be.domain.organization.dto.response.OrganizationResponse;
import com.kukertone.kukertone_be.domain.organization.entity.Organization;
import com.kukertone.kukertone_be.domain.organization.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrganizationService {
    private final OrganizationRepository organizationRepository;

//    public OrganizationListResponse getAll() {
//        List<OrganizationResponse> organizationResponses = organizationRepository.findAll().stream()
//                .map(OrganizationResponse::new)
//                .collect(Collectors.toList());
//        return new OrganizationListResponse(organizationResponses);
//        return null;
//    }

    public OrganizationResponse get(Long organizationId) {
        Organization organization = organizationRepository.findById(organizationId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다"));
        return new OrganizationResponse(organization);
    }

}
