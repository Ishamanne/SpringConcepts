package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouchbaseController {
	
	@Autowired
	CouchbaseService couchbaseService;
	
	@GetMapping("/honda")
	public List<Honda> getcardsByCompanyId(@PathVariable String id){
		return couchbaseService.findByCompanyId(id);
	}

}
