// fig.3.5 
/* 
	This is the application main class
	it call the method of other class GradeBook
	with the argument
*/

//importing libraries block start
import java.util.Scanner;
//importing libraries block end


public class GradeBookMian { //class body end
	
	public static void main(String[] agrs) {// main method body start
		
		//creating objects to take input from user
		Scanner input 				= new Scanner(System.in);
		
		//crateing object of new class to display message 
		GradeBook2 GBObj 	= new GradeBook2();
		
		//declaring variable
		String courseName; 
		
		// pormpting and getting srting type value from user
		 System.out.println("Please enter the course name:");
		 courseName = input.nextLine();
		 System.out.println();
		 
		 //calling method of new class with the argument
		 GBObj.displayMassage(courseName);
		
	} //main method body end
	
} // class body end 
