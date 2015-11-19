package javaLab.ch7.SevenPoint14and15;

public class GradeBookTest
{
	//main method begins program execution
	public static void main( String[] args )
	{
		// array of student grades
		int[] gradesArray 	= { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87, 7, 22, 55};
		String courseName 	= "Java Programming"; 
		GradeBook GB = new GradeBook(courseName, gradesArray);

		GB.displayMsg();
		GB.processGrade();

	} // end main
} // end class GradeBookTest
