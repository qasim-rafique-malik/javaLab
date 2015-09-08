// the use of this code is to take input from user, add them and show the sum to user but
// all in dialog box

//importing libraries
import javax.swing.JOptionPane;

public class CalWithDialog { // class body start
	
	public static void main(String[] args) {// main method body start
		
		//declaring variables
		int firstValCnvrtToInt;
		int secondValCnvrtToInt;
		String firstVal;
		String secondVal;
		
		//taking first value in dialogbox
		firstVal 				= JOptionPane.showInputDialog("Enter the first number");
		
		// converting first string to integer
		firstValCnvrtToInt 		= Integer.parseInt(firstVal);
		
		//taking second value in dialogbox
		secondVal 				= JOptionPane.showInputDialog("Enter the first number");
		//converting second string to integer
		secondValCnvrtToInt 		= Integer.parseInt(secondVal);
		
		
		
		System.out.printf("what is in name \" %d \" \n\n",name);
		
	}// main method body end
	
} // class body end