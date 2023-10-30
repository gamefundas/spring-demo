package com.ssc.ooa.spring;

import org.springframework.stereotype.Service;

@Service
public class DataService {
	
	String getDataFromDatabase(Integer i) {
		return "Dummy Data " + i;
	}

}
