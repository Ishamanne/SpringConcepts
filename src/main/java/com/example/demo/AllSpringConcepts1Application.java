package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;



@SpringBootApplication
@EnableCaching
public class AllSpringConcepts1Application implements CommandLineRunner{
	@Autowired
	private CarsRepository carsRepo;
	
	public static void main(String[] args) {
		
		
	}

	@Override
	public void run(String... args)  {
//		this.repo.deleteAll();
		Honda v = saveVehicle();
//		repo.save(v);
		System.out.println(this.carsRepo.findById(v.getId()));
	}

	private Honda saveVehicle() {
		Honda h = new Honda("myCar","Apple");
		
		h.setId("MyId2021");
		
		return this.carsRepo.save(h);
	}
}
