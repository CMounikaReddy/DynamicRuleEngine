package com.ruleengine.common;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.ems.model.Employee;

import jakarta.persistence.Table;
import lombok.Data;

@Entity

public class Action {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
	
	public String outputKey;
    
    
    
    
    public Action(String outputKey) {
        this.outputKey = outputKey;
        
    }
    

	public String getOutputKey() {
		return outputKey;
	}


	public void setOutputKey(String outputKey) {
		this.outputKey = outputKey;
	}


	public void execute(Action action,List<String> inputs) {
		
		System.out.println("Action executed: " + inputs);
		
	}
}
