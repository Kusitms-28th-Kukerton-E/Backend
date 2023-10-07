package com.kukertone.kukertone_be.domain.kid.dto.response;

import com.kukertone.kukertone_be.domain.kid.entity.Kid;
import com.kukertone.kukertone_be.domain.volunteer.entity.Sex;
import com.kukertone.kukertone_be.domain.volunteer.entity.Volunteer;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class KidResponse {
    private Long id;

    private String name;

    private Long age;

    private Sex sex;

    private String place;

    private String description;

    public KidResponse(Kid kid) {
        this.id=kid.getId();
        this.name = kid.getName();
        this.age = kid.getAge();
        this.sex = kid.getSex();
        this.place = kid.getPlace();
        this.description=kid.getDescription();
    }
}
