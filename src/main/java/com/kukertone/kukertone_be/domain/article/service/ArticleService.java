package com.kukertone.kukertone_be.domain.article.service;

import com.kukertone.kukertone_be.domain.article.dto.request.ArticleRequest;
import com.kukertone.kukertone_be.domain.article.dto.response.ArticleListResponse;
import com.kukertone.kukertone_be.domain.article.dto.response.ArticleResponse;
import com.kukertone.kukertone_be.domain.article.entity.Article;
import com.kukertone.kukertone_be.domain.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleListResponse getAll() {
        List<ArticleResponse> articleResponses = articleRepository.findAll().stream()
                .map(ArticleResponse::new)
                .collect(Collectors.toList());
        return new ArticleListResponse(articleResponses);
    }

    public ArticleResponse get(Long articleId) {
        Article article = articleRepository.findById(articleId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 게시글입니다"));
        return new ArticleResponse(article);
    }

    public void create(ArticleRequest articleRequest) {
        Article article = Article.builder()
                .title(articleRequest.getTitle())
                .content(articleRequest.getContent())
                .category(articleRequest.getCategory())
                .organization(null)//수정해야함
                .build();
        articleRepository.save(article);
    }

    @Transactional
    public void update(Long articleId, ArticleRequest articleRequest) {
        Article article = articleRepository.findById(articleId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다"));
        article.update(articleRequest.getTitle(), articleRequest.getContent(), articleRequest.getCategory());
    }

    public void delete(Long articleId) {
        Article article = articleRepository.findById(articleId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다"));
        articleRepository.delete(article);
    }
}
