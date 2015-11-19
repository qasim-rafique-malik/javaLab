package javaLab.ch8.EightPoint12and13;

public class Employee{
	//instance variable 
	private String firstName;
	private String lastName;
	private static int count;
	public static int myCount;
	
	public Employee(String first, String last){
		
		firstName 		= first;
		lastName 		= last;
		
		count++;
		myCount++;
		
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	public static int getCount(){
		return count;
	}
}
