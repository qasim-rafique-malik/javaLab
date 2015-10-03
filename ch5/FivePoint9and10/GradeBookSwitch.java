package javaLab.ch5.FivePoint9and10;
//Qasim Rafique
//fig.5.9

//importing library
import java.util.Scanner;

public class GradeBookSwitch {//class body start
	
	//declaring instance variable
	private String courseName;
	private int total;
	private int gradeCounter;
	private int aCount;
	private int bCount;
	private int cCount;
	private int dCount;
	private int fCount;
	
	public GradeBookSwitch(String name){//Constructor body start
		
		courseName = name;
		
	}//Constructor body end
	
	public void setCourseName(String name){//setCourseName body start
		
		courseName = name;
		
	}//setCourseName body end
	
	public String getCourseName(){//getCourseName body start
		
		return courseName;
		
	}//getCourseName body end
	
	public void displayMessage(){//displayMessage body start
		
		System.out.printf("Enter Data for Course : \n %s ",
							getCourseName());
		
	}//displayMessage body end
	
	public void inputGrades(){//inputGrades body start
		
		//Reference variable
		Scanner input = new Scanner(System.in);
		
		//local variable
		int grade;
		
		System.out.printf( "%s\n%s\n %s\n %s\n",
		"Enter the integer grades in the range 0-100.",
		"Type the end-of-file indicator to terminate input:",
		"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
		"On Windows type <Ctrl> z then press Enter" );
		
		while(input.hasNext()){
			
			grade = input.nextInt();
			total += grade;
			++gradeCounter;
						
		}
		input.close();
	}//inputGrades body end
	
	
}//class body end