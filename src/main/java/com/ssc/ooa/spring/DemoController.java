package com.ssc.ooa.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	DataService dataService;
	
	@Autowired
	SimpleHttpClient httpClient;
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello from Spring Application";
	}
	
	@GetMapping("/invoke/{id}")
	public String invokeService(@PathVariable("id") int id) {
		return httpClient.getData(id);
	}
	
	@GetMapping("/service/data/{id}")
	public String getData(@PathVariable(value = "id") Integer id) {
		return dataService.getDataFromDatabase(id);
	}

}
