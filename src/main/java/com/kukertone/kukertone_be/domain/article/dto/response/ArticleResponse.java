package com.kukertone.kukertone_be.domain.article.dto.response;

import com.kukertone.kukertone_be.domain.article.entity.Article;
import com.kukertone.kukertone_be.domain.article.Category;
import com.kukertone.kukertone_be.domain.organization.entity.Organization;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@NoArgsConstructor
@Getter
public class ArticleResponse {
    private Long id;

    private String title;

    private Long hour;

    private Category category;

    private LocalDate createdAt;

    private String teacher;

    private String orga;

    private String people;

    private String st;

    public ArticleResponse(Article article) {
        id = article.getId();
        title = article.getTitle();
        hour = article.getHour();
        category = article.getCategory();
        createdAt = article.getCreatedAt().toLocalDate();
        teacher = article.getTeacher();
        orga = article.getOrga();
        people = article.getPeople();
        st = article.getSt();
    }
}
