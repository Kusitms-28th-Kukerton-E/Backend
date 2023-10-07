package com.kukertone.kukertone_be.domain.kid.dto.response;

import com.kukertone.kukertone_be.domain.volunteer.dto.response.VolunteerResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class KidListResponse {
    private Integer size;

    private List<KidResponse> data;

    @Builder
    public KidListResponse(List<KidResponse> data) {
        this.size = data.size();
        this.data = data;
    }
}
