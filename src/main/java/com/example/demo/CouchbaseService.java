package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouchbaseService {
	
	@Autowired
	private CarsRepository carsRepo;
	
	public List<Honda> findByCompanyId(String cid){
		
		return carsRepo.findByCompanyId(cid);
	}

}
