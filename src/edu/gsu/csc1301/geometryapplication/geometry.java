package edu.gsu.csc1301.geometryapplication;

/**
 * This program calculates the area of a circle, the area of a rectangle, 
 * or the area of a triangle based on user input. 
 * 
 * 
 * @author Ariana Tyson
 * @version 11/6/2019
 *
 */

import java.util.Scanner;

public class geometry {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		//Input
		
		System.out.print("Enter your choice (1-3): ");
		int userChoice = in.nextInt();
		
		while (userChoice < 1 || userChoice > 3)
		{
			System.out.print("Invalid choice. Please enter 1 -3: ");
			userChoice = in.nextInt();
		}
		
		//Computation
		
		
		//Output
		
		displayMenu();
		

	}

	//This method will display the options menu for the user to select the area they're looking to find
	public static void displayMenu()
	{
		
		//Output
		
		System.out.println("Welcome to the Geometry Calculator Application\n");
		
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		
	}
	
	/*
	 * This method calculates the area of a circle based off of the user's input for radius 
	 * 
	 * @return circleArea
	 * 
	 * */
	public static double circle()
	{
		
		Scanner in = new Scanner(System.in);
		
		//Input
		
		System.out.print("What is the length of the circle's radius? ");
		double circleRadius = in.nextDouble();		
		
		//Computation
		
		double circleArea = Math.PI * Math.pow(circleRadius, 2);
		
		//Output
		
		return circleArea;
		
	}
	
	/*
	 * This method calculates the area of a rectangle based off of user input 
	 * 
	 * @return rectangleArea
	 * 
	 * */
	public static double rectangle()
	{
		
		Scanner in = new Scanner(System.in);
		
		//Input
		
		System.out.print("What is the rectangle's length? ");
		double rectangleLength = in.nextDouble();
		
		System.out.print("What is the rectangle's width? ");
		double rectangleWidth = in.nextDouble();
		
		//Computation
		
		double rectangleArea = rectangleLength * rectangleWidth;
		
		//Output
		
		return rectangleArea;
		
	}
	
	/*
	 * This method calculates the area of a triangle based on the user inputs 
	 * 
	 * @return triangleArea
	 * 
	 * */
	public static double triangle()
	{
		
		Scanner in = new Scanner(System.in);
		
		//Input
		
		System.out.print("What is the lenght of the triangle's base? ");
		double triangleBase = in.nextDouble();
		
		System.out.print("What is the triangle's height? ");
		double triangleHeight = in.nextDouble(); 
		
		//Computation
		
		double triangleArea = .5 * triangleBase * triangleHeight;
		
		//Output
		
		return triangleArea;
		
	}
	
	/*
	 * This method prints the final area calculation with two decimal points
	 * 
	 * @param area
	 * 
	 * */
	public static void printArea(double area)
	{
		
		System.out.printf("The area is %.2f \n", area);
		
	}
	
	
	
}
