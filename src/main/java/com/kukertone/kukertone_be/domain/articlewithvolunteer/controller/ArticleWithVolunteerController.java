package com.kukertone.kukertone_be.domain.articlewithvolunteer.controller;

import com.kukertone.kukertone_be.domain.articlewithvolunteer.dto.request.ArticleWithVolunteerRequest;
import com.kukertone.kukertone_be.domain.articlewithvolunteer.dto.response.ArticleWithVolunteerListResponse;
import com.kukertone.kukertone_be.domain.articlewithvolunteer.dto.response.ArticleWithVolunteerResponse;
import com.kukertone.kukertone_be.domain.articlewithvolunteer.service.ArticleWithVolunteerService;
import com.kukertone.kukertone_be.domain.kid.service.KidService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/articleWithVolunteer")
public class ArticleWithVolunteerController {
    private final ArticleWithVolunteerService articleWithVolunteerService;

    @GetMapping()
    public ArticleWithVolunteerListResponse getAll(){
        return articleWithVolunteerService.getAll();
    }

    @GetMapping("/{articleWithVolunteerId}")
    public ArticleWithVolunteerResponse get(@PathVariable Long articleWithVolunteerId){
        return articleWithVolunteerService.get(articleWithVolunteerId);
    }

    @PostMapping()
    public void create(@RequestBody ArticleWithVolunteerRequest articleWithVolunteerRequest){
        articleWithVolunteerService.create(articleWithVolunteerRequest);
    }

    @PutMapping("/{articleWithVolunteerId}")
    public void update(@PathVariable Long articleWithVolunteerId, @RequestBody ArticleWithVolunteerRequest articleWithVolunteerRequest){
        articleWithVolunteerService.update(articleWithVolunteerId, articleWithVolunteerRequest);
    }

    @DeleteMapping("/{articleWithVolunteerId}")
    public void delete(@PathVariable Long articleWithVolunteerId){
        articleWithVolunteerService.delete(articleWithVolunteerId);
    }
}

