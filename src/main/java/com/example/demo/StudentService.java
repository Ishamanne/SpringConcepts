package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Cacheable("student")
	public StudentModal getStuById(String id) {
		try {
			System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		return new StudentModal(id,"Siri","V");
		
	}
}
