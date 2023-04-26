package com.sample.core;

import java.io.IOException;

public class Menu {

	public int show() throws IOException {
		
		System.out.println("Menu Options :");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Division");
		System.out.println("Please enter the choice from menu :");

		int number = BasicInput.readInteger();
		System.out.println("Selected choice :" + number);
		
		System.out.println("Please enter first number:");
		int x = BasicInput.readInteger();
		
		System.out.println("Please enter second number:");
		int y = BasicInput.readInteger();
		
		Calculator calc = new Calculator();
		switch (number) {
		case 1:
			calc.add(x,y);
			break;
		case 2:
			calc.sub(x,y);
			break;
		case 3:
			calc.mul(x,y);
			break;
		case 4:
			calc.div(x,y);
			break;
		default:
			calc.add(x,y);
			break;
		}
		return number;
		
	}
}
