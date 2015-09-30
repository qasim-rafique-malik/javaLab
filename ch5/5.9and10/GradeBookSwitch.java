//Qasim Rafique
//fig.5.9

//importing libary
import java.util.Scanner;

public class GradeBookSwitch {//class body start
	
	//declaring instance variable
	private courseName;
	private total;
	private gradeCounter;
	private aCount;
	private bCount;
	private cCount;
	private dCount;
	private fCount;
	
	public GradeBookSwitch(String name){//constrctor body start
		
		courseName = name;
		
	}//constrctor body end
	
	public void setCourseName(){//setCourseName body start
		
		courseName = name;
		
	}//setCourseName body end
	
	public String getCourseName(){//getCourseName body start
		
		return courseName;
		
	}//getCourseName body end
	
	public displayMessage(){//displayMessage body strat
		
		System.out.printf("Enter Data for Course : \n %s ",
							getCourseName());
		
	}//displayMessage body end
	
	public void inputGrades(){//inputGrades body start
		
		//Reffrence variable
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
		
	}//inputGrades body end
	
	
}//class body end