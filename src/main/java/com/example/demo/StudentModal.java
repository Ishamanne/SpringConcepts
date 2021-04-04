package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class StudentModal {
	 String id;
	    String name;
	    String clz;
	 
	    public StudentModal() {
	    	
	    }
	    public StudentModal(String id, String name, String clz) {
	       
	        this.id = id;
	        this.name = name;
	        this.clz = clz;
	    }

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getClz() {
			return clz;
		}

		public void setClz(String clz) {
			this.clz = clz;
		}
	    

}
