/*   
// AUTHOR: Sierra Whitham 
// FILENAME: Assignment2
// SPECIFICATION: prompts player 1 and player 2 to each enter a string for their choice:
rock, paper, or scissors. Then appropriately reports if “Player 1 wins”, “Player 2 wins”, 
or “It is a tie.” If the user string is not rock, scissors or paper, the program will 
print “Wrong choice”.
// FOR: CS 1400 - ASSIGNMENT #2 
// TIME SPENT: 15 min.
//*/ 
import java.util.Scanner;

public class Assignment2 {

	public static void main( String args[] )
	{
		//create scanner object called input
		Scanner input = new Scanner( System.in );
		
		//retrieves player 1 choice 
		System.out.println( "Player 1: Choose rock, scissors, or paper: " );
		String person1 = input.nextLine();
		
		//retrieves player 2 choice
		System.out.println( "Player 2: Choose rock, scissors, or paper: " );
		String person2 = input.nextLine();
		
		//close scanner object
		input.close();
		
		//convert both inputs to lower case letters
		person1 = person1.toLowerCase();
		person2 = person2.toLowerCase();
		
		//check to see if it is a tie
		if( person1.equals( person2 ) )
		{
			System.out.println( "It is a tie." );
		}//end else if
		
		//check to see who won in all other circumstances
		else if( person1.equals( "rock" ) )
		{
			if( person2.equals( "paper" ) )
			{
				System.out.println( "Player 2 wins." );
			}//end if
			else if( person2.equals( "scissors" )  )
			{
				System.out.println( "Player 1 wins." );
			}//end else			
		}//end else if
		else if( person1.equals( "paper" ) )
		{
			if( person2.equals( "rock" ) )
			{
				System.out.println( "Player 1 wins." );
			}//end if 
			else if( person2.equals( "scissors" ) )
			{
				System.out.println( "Player 2 wins." );
			}//end else if
		}//end else if
		else if( person1.equals( "scissors" ) )
		{
			if( person2.equals( "rock" ) )
			{
				System.out.println( "Player 2 wins." );
			}//end if 
			else if( person2.equals( "paper" ) )
			{
				System.out.println( "Player 1 wins." );
			}//end else if
		}//end else if
		else
		{
			System.out.println( "Wrong Choice" );
		}//end else
		
	}//end main method
}//end class Assignment2
