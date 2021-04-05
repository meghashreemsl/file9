package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.DemoDTO;

public interface DemoDAO {
	
	void save(DemoDTO demoDTO);
	
	void update(int id , String name );

}
