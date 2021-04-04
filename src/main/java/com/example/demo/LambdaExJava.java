package com.example.demo;

public class LambdaExJava {

	public static void main(String[] args) {
	
		TwoDigitOperations add = (int x, int y)->x+y;
		
		TwoDigitOperations multiply = (int x, int y)->x*y;
		
		LambdaExJava l = new LambdaExJava();
		
		System.out.println("Addition is " + 
                l.operate(6, 3, add)); 

// Multiply two numbers using lambda expression 
System.out.println("Multiplication is " + 
                l.operate(6, 3, multiply)); 

		
	}

	
	interface TwoDigitOperations
	{
		int operation(int a, int b);
	}
	
	interface Conveymsg
	{
		void sayMsg(String msg);
	}
	
	private int operate(int a, int b,TwoDigitOperations to ) {
		
		return to.operation(a, b);
		
	}
	
	
}
