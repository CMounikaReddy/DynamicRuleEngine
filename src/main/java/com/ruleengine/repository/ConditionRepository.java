package com.ruleengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ruleengine.common.Condition;


@Repository
public interface ConditionRepository extends JpaRepository<Condition, Long> {
    // Custom repository methods, if needed
}
