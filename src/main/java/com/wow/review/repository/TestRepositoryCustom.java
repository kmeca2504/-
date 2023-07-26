package com.wow.review.repository;

import com.wow.review.model.TestEntity;

import java.util.List;
public interface TestRepositoryCustom {
    public List<TestEntity>findALLByNameByQuerydsl(String name);
}
