package com.kukertone.kukertone_be.domain.article.dto.response;

import com.kukertone.kukertone_be.domain.article.entity.Article;
import com.kukertone.kukertone_be.domain.article.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleResponse {
    private Long id;

    private String title;

    private String content;

    private Category category;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;


    public ArticleResponse(Article article) {
        id = article.getId();
        title = article.getTitle();
        content = article.getContent();
        category = article.getCategory();
        createdAt = article.getCreatedAt();
        updatedAt = article.getUpdatedAt();
    }
}
