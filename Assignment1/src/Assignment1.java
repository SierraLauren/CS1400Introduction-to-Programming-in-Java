/*   
// AUTHOR: Sierra Whitham   
// FILENAME: Assigment1.java
// SPECIFICATION: The program asks for the athlete's name. Then the program prompts for three javelin throws, 
which are input by the user. The three throws will be displayed in various dimensions (meters, 
yards, feet, inches, and centimeters).
// FOR: CS 1400 - ASSIGNMENT #1 
// TIME SPENT: 50 min
//*/
import java.util.Scanner;
public class Assignment1{
	public static void main( String args[] )
	{
		//create scanner called userInput
		Scanner userInput = new Scanner (System.in);
		
		//retrieve competitor's name using scanner
		System.out.print( "Enter the competitor's name: " );
		String userName = userInput.nextLine(); 
		
		System.out.println("\n\t\tOlympic Javelin Throws \n"
				+ "\tEnter the distances, in meters, for " + userName);
		
		//retrieve competitor's first javelin throw's measurement
		System.out.print( "\nPlease enter the distance for throw 1:" );
		double firstMeasurement = userInput.nextDouble();
		
		//retrieve competitor's second javelin throw's measurement
		System.out.print( "\nPlease enter the distance for throw 2:" );
		double secondMeasurement = userInput.nextDouble();
		
		//retrieve competitor's third javelin throw's measurement
		System.out.print( "\nPlease enter the distance for throw 3:" );
		double thirdMeasurement = userInput.nextDouble();
		
		//closing the scanner 
		userInput.close();
		
		//Converting the first measurement into yards, feet, inches, and centimeters
		double measurement1InYards = firstMeasurement * 1.093;
		double measurement1InFeet = measurement1InYards * 3;
		double measurement1InInches = measurement1InFeet * 12;
		double measurement1InCM = firstMeasurement * 100;
		
		//Converting the second measurement into yards, feet, inches, and centimeters
		double measurement2InYards = secondMeasurement * 1.093;
		double measurement2InFeet = measurement2InYards * 3;
		double measurement2InInches = measurement2InFeet * 12;
		double measurement2InCM = secondMeasurement * 100;
		
		//Converting the third measurement into yards, feet, inches, and centimeters
		double measurement3InYards = thirdMeasurement * 1.093;
		double measurement3InFeet = measurement3InYards * 3;
		double measurement3InInches = measurement3InFeet * 12;
		double measurement3InCM = thirdMeasurement * 100;
		
		//printing the titles to each category of measurements
		System.out.printf("\n%-10s", "Yards");
		System.out.printf("%-10s", "Feet");
		System.out.printf("%-10s", "Inches");
		System.out.printf("%-10s", "CM");
		
		//printing the results of the first measurement Converted into yards, feet, inches, and centimeters
		System.out.printf("\n%-10.2f", measurement1InYards);
		System.out.printf("%-10.2f", measurement1InFeet);
		System.out.printf("%-10.2f", measurement1InInches);
		System.out.printf("%-10.2f", measurement1InCM);
		
		//printing the results of the second measurement Converted into yards, feet, inches, and centimeters
		System.out.printf("\n%-10.2f", measurement2InYards);
		System.out.printf("%-10.2f", measurement2InFeet);
		System.out.printf("%-10.2f", measurement2InInches);
		System.out.printf("%-10.2f", measurement2InCM);
		
		//printing the results of the third measurement Converted into yards, feet, inches, and centimeters
		System.out.printf("\n%-10.2f", measurement3InYards);
		System.out.printf("%-10.2f", measurement3InFeet);
		System.out.printf("%-10.2f", measurement3InInches);
		System.out.printf("%-10.2f", measurement3InCM);
	}//end method main
}//end class Assignment1
