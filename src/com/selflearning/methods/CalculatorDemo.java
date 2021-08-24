package com.selflearning.methods;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		
// 1. collect input data from user console
		Scanner input = new Scanner(System.in);
		
		System.out.println("-------------------------------------------");
		System.out.println("::Welcome to Airthmatic Calculator::");
		System.out.println("-------------------------------------------");
		System.out.println("Enter Number 1 - Integer number value");
		int x = input.nextInt();
		
		System.out.println("Enter Number 2 - Integer number value");
		int y = input.nextInt();
		
		System.out.println("Number 1 is :"+x);
		System.out.println("Number 2 is :"+y);
		System.out.println("-------------");
		
		//creating object
		Calculator calculator = new Calculator();
		
		//non static methods
		System.out.println("Addition :"+calculator.add(x, y));
		System.out.println("Substraction :"+calculator.sub(x, y));
		System.out.println("Average :"+calculator.avg(x, y));
				
		//static methods
		System.out.println("Multiplicatin :"+Calculator.mul(x, y));
		System.out.println("Division :"+Calculator.divison(x, y));
				
		
		
// 2. declaring variable values
//		int x = 500;
//		int y = 200;
		
		//non static methods
//		System.out.println("X is :"+x +" | Y is :"+y +" | And addition :"+calculator.add(x, y));
//		System.out.println("X is :"+x +" | Y is :"+y +" | And subtraction :"+calculator.sub(x, y));
//		System.out.println("X is :"+x +" | Y is :"+y +" | And Average :"+calculator.avg(x, y));
		
		//static methods
//		System.out.println("X is :"+x +" | Y is :"+y +" | And multiplication :"+Calculator.mul(x, y));
//		System.out.println("X is :"+x +" | Y is :"+y +" | And division :"+Calculator.divison(x, y));


	}

}

class Calculator {
	
	//add
	public float add(int num1, int num2) {
		float result = num1 + num2;
		return result;
	}
	
	//sub
	public float sub(int num1, int num2) {
		float result = num1 - num2;
		return result;
		
	}
	
	//multiplication
	public static double mul(float num1, int num2) {
		double result = num1 * num2;
		return result;
	}
	
	//division
	public static float divison(int num1, float num2) {
		float result = num1 / num2;
		return result;
	}
	
	//average
	public float avg(float num1, float num2) {
		float result = (num1 + num2) /2;
		return result;
	}
}