package com.kukertone.kukertone_be.domain.article.entity;

import com.kukertone.kukertone_be.domain.article.Category;
import com.kukertone.kukertone_be.domain.articlewithvolunteer.entity.ArticleWithVolunteer;
import com.kukertone.kukertone_be.domain.member.entity.Member;
import com.kukertone.kukertone_be.domain.organization.entity.Organization;
import com.kukertone.kukertone_be.domain.organizationReview.entity.OrganizationReview;
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

    private String content;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @Enumerated(EnumType.STRING)
    private Category category;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<ArticleWithVolunteer> articleWithVolunteers = new ArrayList<>();

    public void update(String title, String content, Category category){
        this.title=title;
        this.content=content;
        this.category=category;
    }

    @Builder
    public Article(String title, String content, Organization organization, Category category) {
        this.title = title;
        this.content = content;
        this.organization = organization;
        this.category = category;
    }
}
