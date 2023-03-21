/*   
// AUTHOR: Sierra Whitham
// FILENAME: Geek.java
// SPECIFICATION: The Geek class has two feids: their name and 
 * numQuestions(which keeps track of the number of questions the
 * user has asked). Methods are a variety of questions that the user
 * can ask and the Geek object will answer.
// FOR: CS 1400 - ASSIGNMENT #5 
// TIME SPENT:20 min.
//*/ 

public class Geek {

	private String name;
	private int numQuestions;
	
	//constructor
	public Geek( String name )
	{
		this.name = name;
		numQuestions = 0;
	}//end constructor

	public String getName() 
	{
		return name;
	}//end getter getName

	public int getNumberOfQuestions() 
	{
		return numQuestions;
	}//end getter getNumQuestions
	
	/**
	 * isEven checks if num is an even number
	 * @param num	the int that is being checked to be even
	 * @return 		A boolean which represents if num is even
	 */
	public boolean isEven( int num )
	{
		numQuestions++;
		if( num % 2 == 0)
			return true;
			//end if
		else
			return false;
			//end else 
		
	}//end method isEven
	
	/**
	 * multiConcat concatenates a string with 
	 * itself as for count number of times
	 * @param text	the string that is being concatenated
	 * @param count	the number of times text is concatenated 
	 * with itself
	 * @return 		A String of the final concatenated string
	 */
	public String multiConcat(String text, int count)
	{
		numQuestions++;
		String totalText = "";
		
		if( count < 2)
		{
			return text;
		}
		else
		{
			for( int index = 0; index < count; index++ )
			{
				totalText += text;
			}//end for loop
		}//end else
		
		return totalText;
	}//end method mutiConcat
	
	/**
	 * sumRange returns the sum of integers
	 * between num1 and num2. If num1 is greater 
	 * than num2 or they are even sumRange returns 0.
	 * @param num1	bottom of the range of integers being added
	 * @param num2	top of the range of integers being added
	 * @return 	 	A sum of integers between num1 and num2
	 */
	public int sumRange( int num1, int num2 )
	{
		numQuestions++;
		int sum = 0;
		
		if( (num2 - num1) > 0)
		{
			for(int index = num1 + 1; index < num2; index++)
			{
				sum += index;
			}//end for loop
		}//end if 
		
		return sum;
	}//end method sumRange
	
	/**
	 * sorted returns a boolean which represents
	 * whether num1, num2, and num3 are ordered
	 * in ascending order.
	 * @param num1	the number that is checked to be 
	 * the lowest value
	 * @param num2	the number that is checked to be 
	 * the middle value
	 * @param num3	the number that is checked to be 
	 * the highest value
	 * @return 		A boolean that is true if all 
	 * parameters are in order
	 */
	public boolean sorted( int num1, int num2, int num3 )
	{
		numQuestions++;
		if( (num2 < num1) || (num3 < num2))
		{
			return false;
		}//end if
		
		return true;
	}//end method sorted
	
	/**
	 * countA returns the number of times that
	 * the char 'a' or 'A' appear in the String 
	 * text.
	 * @param text	the string that is analyzed to 
	 * see how many times "a" appears
	 * @return		An int of the total occurrences of a
	 */
	public int countA( String text )
	{
		numQuestions++;
		int count = 0;
		
		for( int index = 0; index < text.length(); index++ )
		{
			if( (text.charAt(index) == 'a') || text.charAt(index) == 'A')
			{
				count++;
			}//end if
		}//end for loop
		
		return count;
	}//end method countA

	/**
	 * countDigits returns the number of digits
	 * in num.
	 * @param num 	int whose number of digits is counted
	 * @return		int representing the total number
	 * of digits in num.
	 */
	public int countDigits( int num )
	{
		numQuestions++;
		int count = 0; 
		while( num > 0 )
		{
			count++;
			num /= 10;
		}//end while
		return count;
	}//end method countDigits
	
	/**
	 * isPrime takes a number(num) and returns
	 * a boolean depending on if num is prime 
	 * or not.
	 * @param num	int that is checked to be prime
	 * @return		A boolean that represents if
	 * num is prime
	 */
	public boolean isPrime( int num )
	{
		numQuestions++;

		for( int index = 2; index < Math.abs(num); index++)
		{
			if( num % index == 0 )
			{
				return false;
			}//end if 
		}//end for loop
		return true;
	}//end method isPrime
	
}//end class Greek

