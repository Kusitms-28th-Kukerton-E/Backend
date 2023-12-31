package com.kukertone.kukertone_be.domain.article.entity;

import com.kukertone.kukertone_be.domain.article.Category;
import com.kukertone.kukertone_be.domain.organization.entity.Organization;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private LocalDateTime createdAt;

    private Long hour;

    private String teacher;

    private String orga;

    private String people;

    private String st;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Builder
    public Article(String title, Long hour, Category category) {
        this.title = title;
        this.hour = hour;
        this.category = category;
    }
}
