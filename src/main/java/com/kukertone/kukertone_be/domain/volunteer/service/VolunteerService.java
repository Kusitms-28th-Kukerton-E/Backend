package com.kukertone.kukertone_be.domain.volunteer.service;

import com.kukertone.kukertone_be.domain.organization.entity.Organization;
import com.kukertone.kukertone_be.domain.organization.repository.OrganizationRepository;
import com.kukertone.kukertone_be.domain.volunteer.dto.response.VolunteerListResponse;
import com.kukertone.kukertone_be.domain.volunteer.dto.response.VolunteerResponse;
import com.kukertone.kukertone_be.domain.volunteer.entity.Volunteer;
import com.kukertone.kukertone_be.domain.volunteer.repository.VolunteerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VolunteerService {
    private final VolunteerRepository volunteerRepository;

    public VolunteerListResponse getAll() {
        List<VolunteerResponse> volunteerResponses = volunteerRepository.findAll().stream()
                .map(VolunteerResponse::new)
                .collect(Collectors.toList());
        return new VolunteerListResponse(volunteerResponses);
    }

    public VolunteerResponse get(Long volunteerId) {
        Volunteer volunteer = volunteerRepository.findById(volunteerId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다"));
        return new VolunteerResponse(volunteer);
    }
}

