package javaLab.ch9.NinePoint4and5;

public class CommissionEmployee extends Object {

	//instance variables
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String first, String last, String ssn, double sales, double rate){
		//implicit call to Object constructor occurs here
		firstName 				= first;
		lastName 				= last;
		socialSecurityNumber 	= ssn;
		setGrossSales(sales);
		setCommisionRate(rate);
	}
	
	//set first name
	public void setFirstName(String first){
		firstName 	= first;
	}
	
	//return first name
	public String getFirstName(){
		return firstName;
	}
	
	//set last name
	public void setlastName(String last){
		lastName 	= last;
	}
	
	//return last name
	public String getLastName(){
		return lastName;
	}
	
	//set social security number
	public void setSocialSecurityNumber(String ssn){
		socialSecurityNumber = ssn;
	}
	
	//return social security number
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}
	
	//set gross sales amount
	public void setGrossSales(double sales){
		if(sales >= 0.0)
			grossSales = sales;
		else
			throw new IllegalArgumentException("Gress sales must be >= 0.0");
		
	}
	
	//return gross sales amount
	public double getGrossSales(){
		return grossSales;
	}
	
	//set commission rate
	public void setCommisionRate(double rate){
		if(rate > 0.0 && rate < 1.0)
			commissionRate = rate;
		else
			throw new IllegalArgumentException("Commossion rate must be > 0.0 and 1.0");
	}
	
	//return commission rate
	public double getCommissionRate(){
		return commissionRate;
	}
	
	//calculate earnings
	public double earning(){
		return commissionRate * grossSales;
	}
	
	//return String representation of CommissioEmployee object
	@Override // indicates that this method overrides a superclass method
	public String toString(){
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
				"commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales,
				"commission rate", commissionRate);
	}
	
}







