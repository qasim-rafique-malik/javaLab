// Fig. 3.7: GradeBook.java
// GradeBook class that contains a courseName instance variable
// and methods to set and get its value

public class GradeBook { // class body start
	
	private String courseName; // course name for this GradeBook
	
	//method to set the course name
	public void setCourseName(String name){ //start method setCourseName
		
		courseName		= name;
	}// end method setCourseName
	
	//method to set the course name
	public String getCourseName(){ //start method getCourseName
	
		return courseName;
	}// end method getCourseName
	
	//display a welcome message to the GradeBook user
	public void displayMassage(){ //start method displayMassage
		
		 // calls getCourseName to get the name of
		 // the course this GradeBook represents
		 System.out.printf( "3.7 and 8 new Welcome to the grade book for\n%s!\n",
			 getCourseName() ); 
	} //end method displayMassage
	
}// class body end
