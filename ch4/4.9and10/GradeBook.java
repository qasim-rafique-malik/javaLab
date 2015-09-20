//Qasim Rafique _9-20-2015
//fig 4.9 
//reason to make this class is to understand sentinal control loop

//importing libray
import java.util.Scanner;

public class GradeBook{//class body start
	
	//instance variable
	private String CourseName;
	
	//class constractor 
	public GradeBook(String name){//constractor body start
		CourseName = name;	
	}//constractor body end
	
	//setCourseName method is use set CourseName
	public void setCourseName(String name){//setCourseName body start
		CourseName = name;
	}//setCourseName body end
	
	//getCourseName method is use get CourseName
	public String getCourseName(){//getCourseName body start
		return CourseName;
	}//getCourseName body end
	
	//displayMessage method is use display CourseName
	public void displayMessage(){//displayMessage body start
		System.out.printf("course name = %s\n", getCourseName());
	}//displayMessage body end
	
	//determineClassAvg method is use calculate the avrage by sentinal control loop
	public void determineClassAvg(){//determineClassAvg body start
		
		//declaring variables
		int total 			= 0;
		int counter 		= 0;
		int grade;
		double avg;
		
		//refrance variables
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter First Grade or Enter -1 to quit: ");
		grade = input.nextInt();
		
		while(grade != -1){
			total 		= grade + total;
			counter		= counter + 1;
			System.out.printf("Enter Next Grade or enter -1 to quite: ");
			grade 		= input.nextInt();			
		}
		
		if(counter != 0){
			avg 		= (double) total/counter;
			System.out.printf("total number of student %d \n",counter);
			System.out.printf("Total Grade %d \n", total);
			System.out.printf("avrage = %.2f \n",avg);
		}
		else{
			System.out.printf("No grade were entered");
		}
		
	}//determineClassAvg body end
	
}//class body end