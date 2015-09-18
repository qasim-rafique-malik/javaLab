// the use of this code is to take input from user, add them and show the sum to user but
// all in dialog box

//importing libraries
import javax.swing.JOptionPane;

public class CalWithDialog { // class body start
	
	public static void main(String[] args) {// main method body start
		
		//declaring variables
		int firstValCnvrtToInt;
		int secondValCnvrtToInt;
		int sum;
		String firstVal;
		String secondVal;
		String message;
		
		//taking first value in dialogbox
		firstVal 					= JOptionPane.showInputDialog("Enter the first number");
		
		// converting first string to integer
		firstValCnvrtToInt 			= Integer.parseInt(firstVal);
		
		//taking second value in dialogbox
		secondVal 					= JOptionPane.showInputDialog("Enter the second number");
		//converting second string to integer
		secondValCnvrtToInt 		= Integer.parseInt(secondVal);
		
		//adding two numbers
		sum = firstValCnvrtToInt + secondValCnvrtToInt;
		
		//formating message
		message = String.format("Sum of two numbers are \n %d",sum);
		
		// showing result of two number;
		JOptionPane.showMessageDialog(null, message);
			
	}// main method body end
	
} // class body end