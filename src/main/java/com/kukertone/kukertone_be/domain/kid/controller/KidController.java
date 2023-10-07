package com.kukertone.kukertone_be.domain.kid.controller;

import com.kukertone.kukertone_be.domain.article.dto.request.ArticleRequest;
import com.kukertone.kukertone_be.domain.article.dto.response.ArticleListResponse;
import com.kukertone.kukertone_be.domain.article.dto.response.ArticleResponse;
import com.kukertone.kukertone_be.domain.article.service.ArticleService;
import com.kukertone.kukertone_be.domain.kid.dto.request.KidRequest;
import com.kukertone.kukertone_be.domain.kid.dto.response.KidListResponse;
import com.kukertone.kukertone_be.domain.kid.dto.response.KidResponse;
import com.kukertone.kukertone_be.domain.kid.service.KidService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/kid")
public class KidController {
    private final KidService kidService;

    @GetMapping()
    public KidListResponse getAll(){
        return kidService.getAll();
    }

    @GetMapping("/{kidId}")
    public KidResponse get(@PathVariable Long kidId){
        return kidService.get(kidId);
    }

    @PostMapping()
    public void create(@RequestBody KidRequest kidRequest){
        kidService.create(kidRequest);
    }

    @PutMapping("/{kidId}")
    public void update(@PathVariable Long kidId, @RequestBody KidRequest kidRequest){
        kidService.update(kidId, kidRequest);
    }

    @DeleteMapping("/{kidId}")
    public void delete(@PathVariable Long kidId){
        kidService.delete(kidId);
    }
}
