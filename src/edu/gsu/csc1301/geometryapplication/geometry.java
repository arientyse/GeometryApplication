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
}
