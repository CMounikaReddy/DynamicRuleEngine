package com.ruleengine.ruleengineservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruleengine.common.Action;
import com.ruleengine.common.Condition;
import com.ruleengine.common.Rule;
import com.ruleengine.datastorageservice.DataStorageService;

import java.util.List;
import java.util.Map;

@Service
public class RuleEvaluationService {

    private final DataStorageService dataStorageService;

    @Autowired
    public RuleEvaluationService(DataStorageService dataStorageService) {
        this.dataStorageService = dataStorageService;
    }

    public void addRule(Rule rule) {
        dataStorageService.addRule(rule);
    }

    public void evaluateRules(List<String> inputs) {
        List<Rule> rules = dataStorageService.getRules();
        
        for (Rule rule : rules) {
        	Condition condition = rule.getCondition();
        	Action action =rule.getAction();
        	for(int i=0;i<inputs.size();i++) {
	            if (condition.getInputKey().equals(inputs.get(i))) {
	                action.execute(rule.getAction(), inputs);
	            }
        	}
        }
    }
}
