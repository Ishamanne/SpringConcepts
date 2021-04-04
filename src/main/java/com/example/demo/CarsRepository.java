package com.example.demo;

import java.util.List;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "honda")
interface CarsRepository   

extends CouchbasePagingAndSortingRepository<Honda,String>{
	
	public List<Honda> findByCompanyId(String companyId);
	
	

}
