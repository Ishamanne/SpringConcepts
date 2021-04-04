package com.example.demo;

public class SingletonClass {
private static SingletonClass instance = null;
private SingletonClass() {
	
}
public static SingletonClass getInstance() {
	
	if(instance==null) {
		synchronized(SingletonClass.class){
			if(instance==null) {
			instance = new SingletonClass();
			}
		}
	}
	return instance;
}

public void getLogs() {
	System.out.println("Get All Executions in logs");
}
}
