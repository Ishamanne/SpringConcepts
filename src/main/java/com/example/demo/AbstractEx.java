package com.example.demo;

public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



abstract class ShapeAbstract {
	
	ShapeAbstract(){
		
		System.out.println("Drawing Shape");
		
	}
	void drawLine() {
		System.out.println("------------------");
	}
//	abstract void some();
	
	abstract void draw();

}


class Circle extends ShapeAbstract{
	Circle(){
		System.out.println("Drawing Circle");
	}
	
	void draw() {
		
		System.out.println("oooooooooooooooooooo");
	}
	
	public static void main(String[] args) {
		
		ShapeAbstract s = new Circle();
		s.drawLine();
		s.draw();
		s.drawLine();
		
	}
}
