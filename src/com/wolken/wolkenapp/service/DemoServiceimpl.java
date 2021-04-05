package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dao.DemoDAO;
import com.wolken.wolkenapp.dao.DemoDAOimpl;
import com.wolken.wolkenapp.dto.DemoDTO;

public class DemoServiceimpl implements DemoService {

	DemoDAO dao = new DemoDAOimpl();

	@Override
	public void validateAndSave(DemoDTO demoDTO) {
		try {
			if (demoDTO != null) {
				if (demoDTO.getName() != null && demoDTO.getName().length() > 2) {
					dao.save(demoDTO);
				} else {
					System.out.println("invalid name");
				}
			} else {
				System.out.println("dto is null");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void validateAndUpdate(int id, String name) {
		if (id > 0) {
			if (name != null && name.length() > 2) {
				dao.update(id, name);
			} else
				System.out.println("invalid name");
		} else
			System.out.println("invalid id");

	}

}
