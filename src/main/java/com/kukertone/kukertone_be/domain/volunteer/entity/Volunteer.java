package com.kukertone.kukertone_be.domain.volunteer.entity;

import com.kukertone.kukertone_be.domain.articlewithvolunteer.entity.ArticleWithVolunteer;
import com.kukertone.kukertone_be.domain.kid.entity.Kid;
import com.kukertone.kukertone_be.domain.member.entity.Member;
import com.kukertone.kukertone_be.domain.member.entity.Role;
import com.kukertone.kukertone_be.domain.organization.entity.Organization;
import com.kukertone.kukertone_be.domain.organizationReview.entity.OrganizationReview;
import com.kukertone.kukertone_be.domain.volunteerReview1.entity.VolunteerReview1;
import com.kukertone.kukertone_be.domain.volunteerReview2.entity.VolunteerReview2;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Volunteer extends Member {
    @OneToMany(mappedBy = "volunteer", cascade = CascadeType.ALL)
    private List<OrganizationReview> organizationReviews = new ArrayList<>();

    @OneToMany(mappedBy = "volunteer", cascade = CascadeType.ALL)
    private List<ArticleWithVolunteer> articleWithVolunteers = new ArrayList<>();

    @OneToMany(mappedBy = "volunteer", cascade = CascadeType.ALL)
    private List<VolunteerReview1> volunteerReview1s = new ArrayList<>();

    @OneToMany(mappedBy = "volunteer", cascade = CascadeType.ALL)
    private List<Kid> kids = new ArrayList<>();

    @OneToMany(mappedBy = "volunteer", cascade = CascadeType.ALL)
    private List<VolunteerReview2> volunteerReview2s = new ArrayList<>();

    @Builder(builderMethodName = "Volunteer")
    public Volunteer(String password, String email, String name, Role role) {
        super(password, email, name, role);
    }
}