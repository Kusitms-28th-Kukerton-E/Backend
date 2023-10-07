package com.kukertone.kukertone_be.domain.articlewithvolunteer.service;

import com.kukertone.kukertone_be.domain.article.dto.request.ArticleRequest;
import com.kukertone.kukertone_be.domain.article.dto.response.ArticleListResponse;
import com.kukertone.kukertone_be.domain.article.dto.response.ArticleResponse;
import com.kukertone.kukertone_be.domain.article.entity.Article;
import com.kukertone.kukertone_be.domain.article.repository.ArticleRepository;
import com.kukertone.kukertone_be.domain.articlewithvolunteer.dto.request.ArticleWithVolunteerRequest;
import com.kukertone.kukertone_be.domain.articlewithvolunteer.dto.response.ArticleWithVolunteerListResponse;
import com.kukertone.kukertone_be.domain.articlewithvolunteer.dto.response.ArticleWithVolunteerResponse;
import com.kukertone.kukertone_be.domain.articlewithvolunteer.entity.ArticleWithVolunteer;
import com.kukertone.kukertone_be.domain.articlewithvolunteer.repository.ArticleWithVolunteerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleWithVolunteerService {
    private final ArticleWithVolunteerRepository articleWithVolunteerRepository;

    public ArticleWithVolunteerListResponse getAll() {
//        List<ArticleWithVolunteerResponse> articleWithVolunteerResponses = articleWithVolunteerRepository.findAll().stream()
//                .map(ArticleWithVolunteerResponse::new)
//                .collect(Collectors.toList());
//        return new ArticleWithVolunteerListResponse(articleWithVolunteerResponses);
        return null;
    }

    public ArticleWithVolunteerResponse get(Long articleWithVolunteerId) {
//        ArticleWithVolunteer articleWithVolunteer = articleWithVolunteerRepository.findById(articleWithVolunteerId)
//                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 게시글입니다"));
//        return new ArticleWithVolunteerResponse(articleWithVolunteer);
        return null;
    }

    public void create(ArticleWithVolunteerRequest articleWithVolunteerRequest) {
//        ArticleWithVolunteer articleWithVolunteer = ArticleWithVolunteer.builder()
//                .title(articleWithVolunteerRequest.getTitle())
//                .content(articleWithVolunteerRequest.getContent())
//                .category(articleWithVolunteerRequest.getCategory())
//                .organization(null)//수정해야함
//                .build();
//        articleWithVolunteerRepository.save(articleWithVolunteer);
    }

    @Transactional
    public void update(Long articleWithVolunteerId, ArticleWithVolunteerRequest articleWithVolunteerRequest) {
//        ArticleWithVolunteer articleWithVolunteer = articleWithVolunteerRepository.findById(articleWithVolunteerId)
//                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다"));
//        articleWithVolunteer.update(articleWithVolunteerRequest.getTitle(), articleWithVolunteerRequest.getContent(), articleWithVolunteerRequest.getCategory());
    }

    public void delete(Long articleWithVolunteerId) {
//        ArticleWithVolunteer articleWithVolunteer = articleWithVolunteerRepository.findById(articleWithVolunteerId)
//                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다"));
//        articleWithVolunteerRepository.delete(articleWithVolunteer);
    }
}
