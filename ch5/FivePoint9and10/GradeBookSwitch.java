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
			incrementLetterGradeCounter(grade);
		}
		input.close();
	}//inputGrades body end
	
	private void incrementLetterGradeCounter(int grade){
		
		switch(grade/10){
			case 9:
			case 10:
				++aCount;
				break;
				
			case 8:
				++bCount;
				break;
				
			case 7:
				++cCount;
				break;
				
			case 6:
				++dCount;
			 	break;
			
			default:
				++fCount;
				//break;
		}
	}
	public void displayGradeReport(){
		
		System.out.println("\nGrade Report:");
		
		if(gradeCounter != 0){
			double average = (double) total / gradeCounter;
			
			System.out.printf("Total of the %d grade entered is %d\n",
					gradeCounter, total);
			System.out.printf( "Class average is %.2f\n", average ); 
			System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
					"Number of students who received each grade:",
					"A: ", aCount,// display number of A grades 115 
					"B: ", bCount, // display number of B grades 116
					"C: ", cCount, // display number of C grades 117 
					"D: ", dCount, // display number of D grades 118 
					"F: ", fCount ); // display number of F grades
		}
		else{
			System.out.println("No grade were entered");
		}
	}
	
	
}//class body end