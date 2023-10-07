package com.kukertone.kukertone_be.domain.article.controller;

import com.kukertone.kukertone_be.domain.article.dto.request.ArticleRequest;
import com.kukertone.kukertone_be.domain.article.dto.response.ArticleListResponse;
import com.kukertone.kukertone_be.domain.article.dto.response.ArticleResponse;
import com.kukertone.kukertone_be.domain.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/articles")
public class ArticleController{
    private final ArticleService articleService;

    @GetMapping()
    public ArticleListResponse getAll(){
        return articleService.getAll();
    }

    @GetMapping("/{articleId}")
    public ArticleResponse get(@PathVariable Long articleId){
        return articleService.get(articleId);
    }

    @PostMapping()
    public void create(@RequestBody ArticleRequest articleRequest){
        articleService.create(articleRequest);
    }

    @PutMapping("/{articleId}")
    public void update(@PathVariable Long articleId, @RequestBody ArticleRequest articleRequest){
        articleService.update(articleId, articleRequest);
    }

    @DeleteMapping("/{articleId}")
    public void delete(@PathVariable Long articleId){
        articleService.delete(articleId);
    }
}
