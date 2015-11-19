package javaLab.ch3.threePoint13To14;
// fig3.13 
// class with constractor and instance variable 
// initialize insatance variable in constractor wiht typr double

public class Account {// class body start
	
	// instance variable
	private double balance;	
	
	// Account is constractor of this class
	public Account(double initialBalance) { // method Account body start
		
		//if initialBalance is greater then 0.0 then it come in the condition
		// and initialize instance variable balance
		if(initialBalance > 0.0){
			balance = initialBalance;
		}
		
	}// method Account body end
	
	// credit is use to increase the balance 
	public void credit( double amount) { // method credit body start
		
		balance = balance + amount;
		
	}//method credit body end
	
	// getBalance will return the balance value where it call
	public double getBalance (){
		
		return balance;
	}
	
	
}// class body end