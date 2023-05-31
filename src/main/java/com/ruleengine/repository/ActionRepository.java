package com.ruleengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ruleengine.common.Action;


@Repository
public interface ActionRepository extends JpaRepository<Action, Long> {
    // Custom repository methods, if needed
}
