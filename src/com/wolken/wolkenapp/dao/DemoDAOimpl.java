package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.DemoDTO;

public class DemoDAOimpl implements DemoDAO {

	@Override
	public void save(DemoDTO demoDTO) {
		try {
			System.out.println("data saved ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void update(int id, String name) {
		System.out.println("data updated ");

	}

}
