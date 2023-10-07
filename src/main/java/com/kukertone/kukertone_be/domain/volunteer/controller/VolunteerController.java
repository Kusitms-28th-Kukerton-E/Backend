package com.kukertone.kukertone_be.domain.volunteer.controller;

import com.kukertone.kukertone_be.domain.volunteer.dto.request.VolunteerRequest;
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

    @PostMapping()
    public void create(@RequestBody VolunteerRequest volunteerRequest){
        volunteerService.create(volunteerRequest);
    }

    @PutMapping("/{volunteerId}")
    public void update(@PathVariable Long volunteerId, @RequestBody VolunteerRequest volunteerRequest){
        volunteerService.update(volunteerId, volunteerRequest);
    }

    @DeleteMapping("/{volunteerId}")
    public void delete(@PathVariable Long volunteerId){
        volunteerService.delete(volunteerId);
    }
}


