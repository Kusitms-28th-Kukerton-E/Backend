package com.kukertone.kukertone_be.domain.volunteer.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class VolunteerListResponse {
    private Integer size;

    private List<VolunteerResponse> data;

    @Builder
    public VolunteerListResponse(List<VolunteerResponse> data) {
        this.size = data.size();
        this.data = data;
    }
}
