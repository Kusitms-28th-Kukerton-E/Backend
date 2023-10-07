package com.kukertone.kukertone_be.domain.organization.entity;

import com.kukertone.kukertone_be.domain.article.entity.Article;
import com.kukertone.kukertone_be.domain.kid.entity.Kid;
import com.kukertone.kukertone_be.domain.member.entity.Member;
import com.kukertone.kukertone_be.domain.member.entity.Role;
import com.kukertone.kukertone_be.domain.organizationReview.entity.OrganizationReview;
import com.kukertone.kukertone_be.domain.volunteerReview1.entity.VolunteerReview1;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Organization extends Member {
    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<OrganizationReview> organizationReviews = new ArrayList<>();

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<VolunteerReview1> volunteerReview1s = new ArrayList<>();

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<Kid> kids = new ArrayList<>();

    @Builder(builderMethodName = "Organization")
    public Organization(String password, String email, String name, Role role) {
        super(password, email, name, role);
    }
}
