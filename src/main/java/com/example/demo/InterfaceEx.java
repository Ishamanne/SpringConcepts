package com.example.demo;

public class InterfaceEx implements Shape {

	public void draw() {
		
		System.out.println("------------------"+ Shape.i);
		Shape.super.explain2021();
		
	}
	public void myOwn() {
		Shape.super.addedFor2025();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceEx i = new InterfaceEx();
		i.draw();
		Shape.callMyName();
		i.myOwn();
		
	
	}

}
 interface Shape{
	 int i =10;
	 void draw();
	 default void explain2021() {
		 System.out.println("Added a new method to all my existing implementing classes");
	 }
	 default void addedFor2025() {
		 System.out.println("Happy New Year 2025");
	 }
	 static void callMyName() {
		 System.out.println("call me with name");
	 }
	 
 }
 interface Multi extends Shape{
	 
	 void tellMyName();
 }
 class Ido implements Multi{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tellMyName() {
		// TODO Auto-generated method stub
		
	}
	 
	 
 }
// abstract class implements Shape{
//	 
//	 
// }