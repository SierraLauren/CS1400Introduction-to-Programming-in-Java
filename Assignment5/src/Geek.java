/*   
// AUTHOR: Sierra Whitham
// FILENAME: Geek.java
// SPECIFICATION: DESCRIPTION OF THIS PROGRAM 
// FOR: CS 1400 - ASSIGNMENT #5 
// TIME SPENT:  
//*/ 

public class Geek {

	private String name;
	private int numQuestions;
	
	public Geek( String name )
	{
		this.name = name;
		numQuestions = 0;
	}//end constructor

	public String getName() 
	{
		return name;
	}//end getter getName

	public int getNumQuestions() 
	{
		return numQuestions;
	}//end getter getNumQuestions
	
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
	
	public int sumRange( int num1, int num2 )
	{
		
	}//end method sumRange
}

