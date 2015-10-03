package javaLab.ch4.FourPoint6and7;
// fig 4.6

//importing library
import java.util.Scanner;

public class GradeBookAvg{//class body start
	
	//instance variable
	private String courseName;
	
	//constractor
	public GradeBookAvg(String name){//constractor body start
		courseName = name;
	}//constractor body end
	
	public void setCourseName(String name){//setCourseName body start
		courseName = name;
	}//setCourseName body end
	
	public String getCourseName(){//getCourseName body start
		return courseName;
	}//getCourseName body end
	
	public void displayMessage(){//displayMessage body start
		System.out.printf("Course Name is \n %s \n",
			getCourseName());
	}//displayMessage body end
	
	public void determinClassAvg(){//determinClassAvg body start
		
		//variable decleration 
		int total = 0;
		int count = 1;
		int studentGrade;
		int avg;
		
		//Reference variable
		Scanner input 		= new Scanner(System.in);
		
		while(count <= 10){
			System.out.print("Enter grade: ");
			studentGrade = input.nextInt();
			total 			= studentGrade + total;
			count++;
		}
		
		avg 				= total/10;
		
		System.out.printf("Class Avarage =  %d", avg);
		input.close();
			
	}//determinClassAvg body end
	
	
	
}//class body end