package com.ruleengine.common;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.ems.model.Employee;

import jakarta.persistence.Table;
import lombok.Data;

@Entity
public class Condition {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
	
	public String inputKey;
	
    
    public Condition(String inputKey) {
        this.inputKey = inputKey;
    }

	public String getInputKey() {
		return inputKey;
	}

	public void setInputKey(String inputKey) {
		this.inputKey = inputKey;
	}
	
	
}
