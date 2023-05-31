package com.ruleengine.ruleengineservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ruleengine.common.Condition;
import com.ruleengine.common.Rule;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rules")
public class RuleEngineService {

    private final RuleEvaluationService ruleEvaluationService;

    @Autowired
    public RuleEngineService(RuleEvaluationService ruleEvaluationService) {
        this.ruleEvaluationService = ruleEvaluationService;
        
    }

  
    @PostMapping("/add")
    public void addRule(@RequestBody Rule rule) {
    	System.out.println("h");
        ruleEvaluationService.addRule(rule);
    }

    @PostMapping("/evaluate")
    public void evaluateRules(@RequestBody List<String>inputs) {
        ruleEvaluationService.evaluateRules(inputs);
    }
}
