/*   
// AUTHOR: Sierra Whitham
// FILENAME: Assignment3.java
// SPECIFICATION: The user inputs two strings and is them prompted 
to choose options from a menu until they quit the program.
// FOR: CS 1400 - ASSIGNMENT #3 
// TIME SPENT: 30 min
//*/ 

import java.util.Scanner;

public class Assignment3 {

	public static void main( String args[] )
	{
		//create scanner called input
		Scanner input = new Scanner( System.in );
		
		//get user's first strings
		System.out.println( "Please enter a String." );
		String firstS = input.nextLine();
				
		//get user's second strings
		System.out.println( "Please enter another String." );
		String secondS = input.nextLine();
		
		//print command options
		System.out.println( "\nCommand Options:\n" 
			+ "---------------------------\n"
			+ "Option a: checks if the length of the two strings are the same.\n"
			+ "Option b: checks if two strings are the same or different.\n"
			+ "Option c: checks which string is lexically larger, or if they are the same.\n"
			+ "Option d: prints out the first character (index 0) of each string.\n"
			+ "Option e: prints out a new string consisting of the first string concatenated (appended) with the second string.\n"
			+ "Option f: prints out two strings using upper case letters.\n"
			+ "Option q: quit the program.\n" );
		
		//prompt user to choose option from menu
		System.out.println( "Please enter an option from the menu." );
		String menuOpt = input.nextLine();
		
		//perform options until "q" is selected
		while( !menuOpt.equals("q") )
		{
			switch ( menuOpt )
			{
				case "a":
					
					if( firstS.length() == secondS.length() )
					{
						System.out.println( "The lengths are the same." );
					}//end if
					else
					{
						System.out.println( "The lengths are not the same." );
					}//end else
					
					break;
				case "b":
					
					if( firstS.equals( secondS ))
					{
						System.out.println( "The two strings are the same." );
					}//end if
					else
					{
						System.out.println( "The two strings are different." );
					}//end else
					break;
					
				case "c":
					
					if( firstS.compareTo( secondS ) > 0 )
					{
						System.out.println( "The first string is lexically larger." );
					}//end if
					else if( firstS.compareTo( secondS ) < 0 )
					{
						System.out.println( "The second string is lexically larger." );
					}//end else if
					else
					{
						System.out.println( "The two strings are the same." );
					}//end else
					break;
					
				case "d":
					System.out.println("The first character of the first string is " + firstS.charAt(0)
						+ "\nThe first character of the second string is " + secondS.charAt(0));
					break;
					
				case "e":
					System.out.println("The concatenation of two strings is \"" 
						+ firstS + secondS + "\"");
					break;
					
				case "f":
					
					System.out.println( "The first string using upper case letters: " + firstS.toUpperCase()
						+ "\nThe second string using upper case letters: " + secondS.toUpperCase() );
					break;
				default:
					System.out.println( "Invalid option.");
					break;
			}//end switch
			
			//continue prompting user to choose options until "q" is selected
			System.out.println( "\nPlease enter an option from the menu." );
			menuOpt = input.nextLine();
			
		}//end while loop
		
		//closer scanner
		input.close();
		
		System.out.println( "\nGoodbye!" );
		
	}//end method main
}//end class Assignment3
