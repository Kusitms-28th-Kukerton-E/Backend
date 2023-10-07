package com.kukertone.kukertone_be.domain.volunteer.dto.response;

import com.kukertone.kukertone_be.domain.organization.dto.response.OrganizationResponse;
import com.kukertone.kukertone_be.domain.organization.entity.Organization;
import com.kukertone.kukertone_be.domain.volunteer.entity.Sex;
import com.kukertone.kukertone_be.domain.volunteer.entity.Volunteer;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class VolunteerResponse {
    private String name;

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


    public VolunteerResponse(Volunteer volunteer) {
        this.name = volunteer.getName();
        this.image = volunteer.getImage();
        this.age = volunteer.getAge();
        this.sex = volunteer.getSex();
        this.place = volunteer.getPlace();
        this.school = volunteer.getSchool();
        this.major=volunteer.getMajor();
        this.score1 = volunteer.getScore1();
        this.score2 = volunteer.getScore2();
        this.score3 = volunteer.getScore3();
        this.vmsId1 = volunteer.getVmsId1();
        this.vmsId2 = volunteer.getVmsId2();
    }
}
