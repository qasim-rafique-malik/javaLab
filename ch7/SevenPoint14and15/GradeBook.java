package javaLab.ch7.SevenPoint14and15;

public class GradeBook{
	//instance variables
	private String courseName;
	private int[] grades;
	
	//constructor
	public GradeBook(String courseName, int[] grades){
		this.courseName 	= courseName;
		this.grades 		= grades;
	}
	
	public void getGradeList(){
		for(int grade : grades)
		System.out.print(" "+grade);
		System.out.println();
	}
	
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
	
	public String getCourseName(){
		return this.courseName;
	}
	
	
	public void displayMsg(){
		
		System.out.printf("welcome to the grade book for \n %s \n\n",
		this.getCourseName());
		
	}
	
	public void processGrade(){
		
		this.outputGrades();
		
		System.out.printf("Class average is : %f \n",this.getAverage());
		
		System.out.printf("Max grade is: %d \n Min grade is: %d\n",this.getMaximum(),this.getMinimum());
		
		this.outputBarChart();
	}
	
	//getMaximum function will return maximum element of grades array 
	private int getMaximum(){
		
		int highestGrade = grades[0];
		
		for(int grade : grades){
			
			if(grade > highestGrade){
				
				highestGrade = grade;
			}
		}
		return highestGrade;
	}

	//getMinimumm function will return minimum element of grades array 
	private int getMinimum(){
		
		int lowestGrade = grades[0];
		
		for(int grade : grades){
			
			if(grade < lowestGrade){
				lowestGrade = grade;
			}
		}
		
		return lowestGrade;
	}
	
	//getAverage function will return the average of array grade
	private double getAverage(){
		int total = 0;
		
		for(int grade : grades){
			
			total += grade;
		}
		return (double) total/grades.length;
	}
	
	//this function will print the grade bar chart;
	private void outputBarChart(){
		
		int[] frequency = new int[11];
		
		//counting grade and store the count in frequency array
		for(int grade: grades)
			++frequency[grade/10];
		
		//printing the grade range
		for(int count = 0; count < frequency.length; count++){
			if(count == 10)
				System.out.printf("%7d :", 100);
			else
				System.out.printf("%2d - %2d :", count*10, count*10+9);
			
			//printing stars against the grade
			for(int star = 0; star < frequency[count]; star++)
				System.out.print('*');
			
			System.out.println();
		}
	}
	
	//this function will list the grades of students
	private void outputGrades(){
		
		System.out.println("The grades are: ");
		//print each student grade
		for(int student = 0; student < grades.length; student++){
			System.out.printf("Student %2d: %3d \n", student+1, grades[student] );
		}
	}

}
