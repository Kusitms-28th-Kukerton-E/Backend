package com.kukertone.kukertone_be.domain.volunteer.service;

import com.kukertone.kukertone_be.domain.organization.entity.Organization;
import com.kukertone.kukertone_be.domain.organization.repository.OrganizationRepository;
import com.kukertone.kukertone_be.domain.volunteer.dto.request.VolunteerRequest;
import com.kukertone.kukertone_be.domain.volunteer.dto.response.VolunteerListResponse;
import com.kukertone.kukertone_be.domain.volunteer.dto.response.VolunteerResponse;
import com.kukertone.kukertone_be.domain.volunteer.entity.Volunteer;
import com.kukertone.kukertone_be.domain.volunteer.repository.VolunteerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VolunteerService {
    private final VolunteerRepository volunteerRepository;

    public VolunteerListResponse getAll() {
//        List<VolunteerResponse> volunteerResponses = volunteerRepository.findAll().stream()
//                .map(VolunteerResponse::new)
//                .collect(Collectors.toList());
//        return new VolunteerListResponse(volunteerResponses);
        return null;
    }

    public VolunteerResponse get(Long volunteerId) {
//        Volunteer volunteer = volunteerRepository.findById(volunteerId)
//                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 게시글입니다"));
//        return new VolunteerResponse(volunteer);
        return null;
    }

    public void create(VolunteerRequest volunteerRequest) {
//        Volunteer volunteer = Volunteer.builder()
//                .title(volunteerRequest.getTitle())
//                .content(volunteerRequest.getContent())
//                .category(volunteerRequest.getCategory())
//                .volunteer(null)//수정해야함
//                .build();
//        volunteerRepository.save(volunteer);
    }

    @Transactional
    public void update(Long volunteerId, VolunteerRequest volunteerRequest) {
//        Volunteer volunteer = volunteerRepository.findById(volunteerId)
//                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다"));
//        volunteer.update(volunteerRequest.getTitle(), volunteerRequest.getContent(), volunteerRequest.getCategory());
    }

    public void delete(Long volunteerId) {
//        Volunteer volunteer = volunteerRepository.findById(volunteerId)
//                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다"));
//        volunteerRepository.delete(volunteer);
    }
}

