package com.wolken.wolkenapp;

import com.wolken.wolkenapp.dto.DemoDTO;
import com.wolken.wolkenapp.service.DemoService;
import com.wolken.wolkenapp.service.DemoServiceimpl;

public class DemoUtil {

	public static void main(String[] args) {

		DemoService service = new DemoServiceimpl();
		try {
			DemoDTO dto = new DemoDTO();
			dto.setId(1);
			dto.setName("meghashree");
			dto.setNumber(1234567890);

			service.validateAndSave(dto);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			service.validateAndUpdate(2, "nikunj");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
