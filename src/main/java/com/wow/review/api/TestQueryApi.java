package com.wow.review.api;

import com.wow.review.model.TestEntity;
import com.wow.review.service.TestService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TestQueryApi {
    private final TestService testService;

    @GetMapping("/test/query/jpa")
    public  List<TestEntity>queryJpa(){
        return testService.findAllByNameByJPA("wow");
    }

    @GetMapping("/test/query/querydsl")
    public List<TestEntity>queryQuerydsl(){
        return testService.findAllByNameByQuerydsl("wow");
    }
}
