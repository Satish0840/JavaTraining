/**
 * 
 */
package com.sample.core;

public class Calculator {
	
	public void add(int a,int b) {
		int result = a+b;
		System.out.println("Adding of a+b : "+ result );
	}
	
	public void sub(int a,int b) {
		int result = a-b;
		System.out.println("Subtraction of a-b : "+ result );
	}
	
	public void mul(int a,int b) {
		int result = a*b;
		System.out.println("Multiplication of a*b : "+ result );
	}
	
	public void div(int a,int b) {
		int result = a/b;
		System.out.println("Division of a/b : "+ result );
	}
	
	public void sqrt(int a) {
		int result = a*a;
		System.out.println("Sqrt of a : "+ result );
	}
	
	public void cube(int a) {
		int result = a*a*a;
		System.out.println("Cube of a : "+ result );
	}
	
}
