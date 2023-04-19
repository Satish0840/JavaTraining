/**
 * 
 */
package com.sample.core;

public class Entry {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		
		Calculator calc = new Calculator();
		calc.add(a,b);
		calc.sub(a,b);
		calc.mul(a,b);
		calc.div(a,b);
		calc.sqrt(a);
		calc.cube(a);
	}

}
