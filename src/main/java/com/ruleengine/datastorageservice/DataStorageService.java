package com.ruleengine.datastorageservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruleengine.common.Condition;
import com.ruleengine.common.Rule;
import com.ruleengine.repository.ActionRepository;
import com.ruleengine.repository.ConditionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataStorageService {

	@Autowired
	private final ConditionRepository cRepository=null;
	
	@Autowired
    private final ActionRepository aRepository=null;

   

    public void addRule(Rule rule) {
    	
    	cRepository.save(rule.getCondition());
    	
    }

    public List<Rule> getRules() {
    	List<Rule> rules=new ArrayList<>();
        List<Condition> findAll = cRepository.findAll();
        for(Condition c: findAll) {
        	Rule r=new Rule();
        	r.setCondition(c);
        	rules.add(r);
        }
        return rules;
    }
}
