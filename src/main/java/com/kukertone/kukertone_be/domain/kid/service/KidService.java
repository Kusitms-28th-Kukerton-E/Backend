package com.kukertone.kukertone_be.domain.kid.service;

import com.kukertone.kukertone_be.domain.article.dto.request.ArticleRequest;
import com.kukertone.kukertone_be.domain.article.dto.response.ArticleListResponse;
import com.kukertone.kukertone_be.domain.article.dto.response.ArticleResponse;
import com.kukertone.kukertone_be.domain.article.entity.Article;
import com.kukertone.kukertone_be.domain.article.repository.ArticleRepository;
import com.kukertone.kukertone_be.domain.kid.dto.request.KidRequest;
import com.kukertone.kukertone_be.domain.kid.dto.response.KidListResponse;
import com.kukertone.kukertone_be.domain.kid.dto.response.KidResponse;
import com.kukertone.kukertone_be.domain.kid.entity.Kid;
import com.kukertone.kukertone_be.domain.kid.repository.KidRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class KidService {
    private final KidRepository kidRepository;

    public KidListResponse getAll() {
        List<KidResponse> kidResponses = kidRepository.findAll().stream()
                .map(KidResponse::new)
                .collect(Collectors.toList());
        return new KidListResponse(kidResponses);
    }

    public KidResponse get(Long kidId) {
        Kid kid = kidRepository.findById(kidId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다"));
        return new KidResponse(kid);
    }

}
