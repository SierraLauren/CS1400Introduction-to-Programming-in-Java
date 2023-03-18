/*-------------------------------------------------------------
// AUTHOR: Sierra Whitham
// FILENAME: Student.java
// SPECIFICATION: Class student allows the program to organize a student object's
 * information in the following fields: fistName, lastName, fullName, broncoId, and grade.
 * It has getters for all fields and a setter for grade.
// FOR: CS 1400- Lab #5
// TIME SPENT: 5 min. 
//-----------------------------------------------------------*/

public class Student {

	private String firstName;
	private String lastName;
	private String fullName;
	private String broncoId;
	private double grade;
	
	Student( String fname, String lname, String broncoId )
	{
		firstName = fname;
		lastName = lname;
		this.broncoId = broncoId;
		fullName = firstName + " " + lastName;
		grade = -1.0;
	}//end constructor
	
	public String getFirstName()
	{
		return firstName;
	}//end getter getFirstName
	
	public String getLastName()
	{
		return lastName;
	}//end getter getLastName
	
	public String getFullName()
	{
		return fullName;
	}//end getter getFullName
	
	public String getBroncoId()
	{
		return broncoId;
	}//end getter getBroncoId
	
	public double getGrade()
	{
		return grade;
	}//end getter getGrade
	
	public String toString()
	{
		return String.format("Student: %s, Bronco ID: %s, Grade: %.2f",
                getFullName(), getBroncoId(), getGrade());
	}//end method toString
	
	public void setGrade( double newGrade )
	{
		grade = newGrade;
	}//end setter setGrade
}
