/*
// AUTHOR: Sierra Whitham 
// FILENAME: Lab3.java
// SPECIFICATION: User is prompted to input their homework, midterm, and final 
exam grade and the program will calculate the total weighed grade. The program
prints if the user has passed the class or not. 
// FOR: CS 1400- Lab #3
// TIME SPENT: 25 min.
//*/

import java.util.Scanner;

public class Lab3 {
    public static void main( String[] args ) 
    {
    	
        // This scanner is prepared for you to get inputs
        Scanner scanner = new Scanner(System.in);
        
        // Declare three variables for HW, midterm, and final exam grades
        double hW = 0, midterm = 0, finalExam =0;
        
        // Declare a loop control variable i
        int i = 0; 

        while ( i < 3 ) 
        {
            // Design if-else control flow:
            //
            // if i is 0, asks for the homework grade
            // if i is 1, asks for the midterm exam grade
            // if i is 2, asks for the final exam grade
            //
            // You have to let the user re-try if any of the inputs is invalid.
            // - homework grade is in [0, 100]
            // - midterm grade is in [0, 100]
            // - final exam grade is in [0, 200]
            //
            // The first if-else statement is attached for your reference. You have to
            // finish the last two statments by yourself.

            if (i == 0) 
            {
                // Ask the user for homework grade
            	System.out.println( "\nEnter your HOMEWORK grade: " );

                // Do input validation
            	hW = scanner.nextDouble();
            	
                if ( hW > 100 || hW < 0 ) 
                {
                    // Show the error message
                    System.out.println( "[ERR] Invalid input. A howework grade should be in [0, 100]" );
                    
                }//end if
                else 
                {
                    // Update the loop variable
                    i++;
                }//end else
            }//end if
            // The other two if statements go here
            
            if (i == 1) 
            {
                // Ask the user for midterm grade
            	System.out.println( "\nEnter your MIDTERM EXAM grade: " );

                // Do input validation
            	midterm = scanner.nextDouble();
                if ( midterm > 100 || midterm < 0 ) 
                {
                    // Show the error message
                	System.out.println( "[ERR] Invalid input. A midterm grade should be in [0, 100]" );
                	
                }//end if
                else 
                {
                    // Update the loop variable
                    i++;
                }//end else
            }//end if  
            
            if (i == 2) 
            {
                // Ask the user for final grade
            	System.out.println( "\nEnter your FINAL EXAM grade: " );

                // Do input validation
            	finalExam = scanner.nextDouble();
            	
                if ( finalExam > 200 || finalExam < 0 ) 
                {
                    // Show the error message
                	System.out.println( "[ERR] Invalid input. A final grade should be in [0, 200]" );
                	
                }//end if
                else 
                {
                    // Update the loop variable
                    i++;
                }//end else
            }//end if 
        }//end while loop

        
        
        // Calculate the weighted total by the formula showed in the PDF
        double weighted_total = ( finalExam / 200 * 50 ) + ( midterm * 0.25 ) + ( hW * 0.25);

        // Show the weighted total and tell the user s/he passed or not
        System.out.println( "\n[INFO] Student's Weighted Total is " + weighted_total );
        
        if ( weighted_total > 50 || weighted_total == 50) 
        {
            // Print "the student PASSED the class."
        	System.out.println( "\n[INFO] Student PASSED the class " );
        }//end if 
        else 
        {
            // Print "the student FAILED the class."
        	System.out.println( "\n[INFO] Student FAILED the class" );
        }//end else

        scanner.close();

    }  // End of main
}  // End of class
