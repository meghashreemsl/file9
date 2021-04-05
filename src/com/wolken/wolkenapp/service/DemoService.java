package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.DemoDTO;

public interface DemoService {
	
	void validateAndSave(DemoDTO demoDTO);
	
	void validateAndUpdate(int id , String name );

}
