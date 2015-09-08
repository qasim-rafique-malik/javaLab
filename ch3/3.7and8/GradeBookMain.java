// fig.3.5 
/* 
	This is the application main class
	it call the method of other class GradeBook
	with the argument
*/

//importing libraries block start
import java.util.Scanner;
//importing libraries block end


public class GradeBookMain { //class body end
	
	public static void main(String[] agrs) {// main method body start
		
		//creating objects to take input from user
		Scanner input 				= new Scanner(System.in);
		
		//crateing object of new class to display message 
		GradeBook GBObj 	= new GradeBook();
		
		//declaring variable
		String courseName; 
		
		System.out.printf("checking the default value %s\n",
			GBObj.getCourseName());
		
		// pormpting and getting srting type value from user
		 System.out.println("Please enter the course name:");
		 courseName = input.nextLine();
		 GBObj.setCourseName(courseName);
		 System.out.println();
		 
		 //calling method of new class with the argument
		 GBObj.displayMassage();
		
	} //main method body end
	
} // class body end 
