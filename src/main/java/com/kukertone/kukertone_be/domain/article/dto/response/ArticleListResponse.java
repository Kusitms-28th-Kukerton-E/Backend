package com.kukertone.kukertone_be.domain.article.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Getter
public class ArticleListResponse {
    private Integer size;

    private List<ArticleResponse> data;

    @Builder
    public ArticleListResponse(List<ArticleResponse> data) {
        size = data.size();
        this.data = data;
    }
}
