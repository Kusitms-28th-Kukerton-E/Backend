package com.kukertone.kukertone_be.domain.articlewithvolunteer.entity;

import com.kukertone.kukertone_be.domain.article.entity.Article;
import com.kukertone.kukertone_be.domain.volunteer.entity.Volunteer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class ArticleWithVolunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    private Article article;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "volunteer_id")
    private Volunteer volunteer;
}
