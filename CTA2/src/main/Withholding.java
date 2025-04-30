
package main;

//This is to allow the user to input their own income!
import java.util.Scanner;

public class Withholding {	
	public static void main(String[] args) {
		//Defining the variables we are going to use.
		int income = 0;
		float taxRate = 0f;
		float taxBeingHeld = 0f;
		
		// Prompt user for weekly income
        Scanner scanny = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your weekly income:");
        String incomeString = scanny.nextLine();
        income = Integer.parseInt(incomeString);
        
        //The if/else statement nightmare.
		if(income < 500) {
			taxRate = 0.1f;
		} else if(income >= 500 && income < 1500) {
			taxRate = 0.15f;
		} else if(income >= 1500 && income < 2500) {
			taxRate = 0.2f;
		} else if (income >= 2500) {
			taxRate = 0.3f;
		}
		
		//Calculating the withheld amount and printing it to the console.
		taxBeingHeld = income*taxRate;
		System.out.println("Money being withheld from taxes: " + taxBeingHeld);
	}
}
