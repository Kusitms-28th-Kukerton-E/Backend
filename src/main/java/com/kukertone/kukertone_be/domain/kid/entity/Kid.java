package com.kukertone.kukertone_be.domain.kid.entity;

import com.kukertone.kukertone_be.domain.member.entity.Member;
import com.kukertone.kukertone_be.domain.organization.entity.Organization;
import com.kukertone.kukertone_be.domain.volunteer.entity.Volunteer;
import com.kukertone.kukertone_be.domain.volunteerReview2.entity.VolunteerReview2;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Kid extends Member {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "volunteer_id")
    private Volunteer volunteer;

    @OneToMany(mappedBy = "kid", cascade = CascadeType.ALL)
    private List<VolunteerReview2> volunteerReview2s = new ArrayList<>();
}
