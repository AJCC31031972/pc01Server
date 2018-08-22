package org.cjava.eurekaserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/rest/hola/server/{id}")
public class HolaResource {
	
	
	@GetMapping
	public String hola(@PathVariable("id") String id) {
		String result ="";
		result = id.equals("1") ? "JUAN": "CARLOS";
		return result;
	}
}
