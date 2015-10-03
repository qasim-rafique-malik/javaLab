package javaLab.ch3.threePoint13To14;
// fig 3.14
// Account is use call mathod of class Account

//importing libarary block start
import java.util.Scanner;
//importing libarary block end 

public class AccountTest { // AccountTest class body start
	
	// main method 
	public static void main(String[] args){
		
		//creating new objects
		Scanner input = new Scanner(System.in);
		Account account1 = new Account(50.77);
		Account account2 = new Account(-7.80);
		
		//declaring variable
		double depositAmount;
		
		// getting total balance for both account 
		System.out.printf("account1 balance is  $%.2f\n\n",account1.getBalance());
		System.out.printf("account2 balance is  $%.2f\n\n",account2.getBalance());
		
		// getting amount from user 
		System.out.print("Please enter amount: ");
		depositAmount = input.nextDouble();
		
		// deposit some ammount in account one
		account1.credit(depositAmount);
		System.out.printf("\nthe amount (%.2f) is added to account1\n",depositAmount);
		
		
		
		// getting total balance for both account 
		System.out.printf("account1 balance is  $%.2f\n\n",account1.getBalance());
		System.out.printf("account2 balance is  $%.2f\n\n",account2.getBalance());
		
		// getting amount from user 
		System.out.print("Please enter amount: ");
		depositAmount = input.nextDouble();
		
		// deposit some ammount in account one
		account2.credit(depositAmount);
		System.out.printf("\nthe amount (%.2f) is added to account2\n",depositAmount);
		
		
		
		// getting total balance for both account 
		System.out.printf("account1 balance is  $%.2f\n\n",account1.getBalance());
		System.out.printf("account2 balance is  $%.2f\n\n",account2.getBalance());
		
		input.close();
		
		
	}//main method body end
	
}// AccountTest class body end