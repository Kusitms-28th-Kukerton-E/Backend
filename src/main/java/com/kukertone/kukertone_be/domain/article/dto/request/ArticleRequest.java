package com.kukertone.kukertone_be.domain.article.dto.request;

import com.kukertone.kukertone_be.domain.article.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ArticleRequest {
    private String title;
    private String content;
    private Category category;
}
