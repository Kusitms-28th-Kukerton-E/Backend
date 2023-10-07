package com.kukertone.kukertone_be.domain.volunteer.controller;

import com.kukertone.kukertone_be.domain.volunteer.dto.response.VolunteerListResponse;
import com.kukertone.kukertone_be.domain.volunteer.dto.response.VolunteerResponse;
import com.kukertone.kukertone_be.domain.volunteer.service.VolunteerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/volunteer")
public class VolunteerController {
    private final VolunteerService volunteerService;

    @GetMapping()
    public VolunteerListResponse getAll(){
        return volunteerService.getAll();
    }

    @GetMapping("/{volunteerId}")
    public VolunteerResponse get(@PathVariable Long volunteerId){
        return volunteerService.get(volunteerId);
    }


}


