package main;

//This is to allow the user to input their own income!
import java.util.Scanner;

public class LoopingConstruct {
	public static void main(String[] args) {
		
		//Defining some readonly variables. I like to keep them seperate.
		int numbersToRecord = 5; //This will be the number of floating points the user will enter.
		float interest = 0.2f; //The 20% interest we will calculate later.
		
		//Defining variables we are going to use throughout the program.
		int userEnteredCount = 0; //How many numbers the user has entered.
		float total = 0f; //The total of the floating points entered by the user.
		float average = 0f; //The average of the floating points entered by the user.
		float maxValue = -Float.MAX_VALUE; //The max value of the floating points entered by the user.
		float minValue = Float.MAX_VALUE; //The minimum value of the floating points entered by the user.
		float totalInterest = 0f; //The 20% interest of the total.
		float[] numberList = new float[numbersToRecord]; //Creating the empty list for the numbers.
		
		//In this while loop, prompt the user 5 times to enter a floating point number.
		while(userEnteredCount < numbersToRecord) {
			Scanner scanny = new Scanner(System.in);  // Create a Scanner object
	        System.out.println("Enter your floating-point value ("+(userEnteredCount+1)+" of "+numbersToRecord + "): ");
	        String numString = scanny.nextLine();
	        float numToAddToList = Float.parseFloat(numString);
	        numberList[userEnteredCount] = numToAddToList;
			userEnteredCount++;
		}
		
		//This for loop will calculate the total of all the numbers.
		for(int i = 0; i < numberList.length; i++) {
			total += numberList[i];
		}
		
		//Calculating the average.
		average = (total/numberList.length);
		
		//This for loop will find the maximum value out of the numberList.
		for(int j = 0; j < numberList.length; j++) {
			if(numberList[j] > maxValue) {
				maxValue = numberList[j];
			}
		}
		
		//This for loop will find the smallest value out of the numberList.
		for(int k = 0; k < numberList.length; k++) {
			if(numberList[k] < minValue) {
				minValue = numberList[k];
			}
		}
		
		//Here is where the total interest is calculated.
		totalInterest = (total*interest);
		
		//Now, we will finally print out our calculated values!
		System.out.println("The total of the values is: " + total);
		System.out.println("The average of the values is: " + average);
		System.out.println("The maximum value is: " + maxValue);
		System.out.println("The minimum value is: " + minValue);
		System.out.println("The 20% interest of total is: " + totalInterest);
	}
}
