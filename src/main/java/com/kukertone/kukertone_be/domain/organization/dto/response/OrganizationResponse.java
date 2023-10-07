package com.kukertone.kukertone_be.domain.organization.dto.response;

import com.kukertone.kukertone_be.domain.organization.entity.Organization;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OrganizationResponse {
    private String address;
    private String activity;
    private String name;
    private Long id;
    private Long score1;
    private Long score2;
    private Long score3;

    public OrganizationResponse(Organization organization) {
        this.address=organization.getAddress();
        this.activity=organization.getActivity();
        this.name=organization.getName();
        this.id=organization.getId();
        this.score1=organization.getScore1();
        this.score2=organization.getScore2();
        this.score3=organization.getScore3();
    }
}
