package com.kukertone.kukertone_be.domain.volunteer.entity;

import com.kukertone.kukertone_be.domain.kid.entity.Kid;
import com.kukertone.kukertone_be.domain.member.entity.Member;
import com.kukertone.kukertone_be.domain.member.entity.Role;
import com.kukertone.kukertone_be.domain.organization.entity.Organization;
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
    private String image;

    private Long age;

    private Sex sex;

    private String place;

    private String school;

    private String major;

    private Long score1;
    private Long score2;
    private Long score3;

    private String vmsId1;
    private String vmsId2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @Builder(builderMethodName = "Volunteer")
    public Volunteer(String password, String email, String name, Role role) {
        super(password, email, name, role);
    }
}