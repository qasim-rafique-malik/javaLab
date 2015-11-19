package javaLab.ch9.NinePoint6and7;

public class BasePlusCommissionEmployee {


	//instance variables
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String first, String last,
			String ssn, double sales, double rate, double salary){
		//implicit call to Object constructor occurs here
		firstName 				= first;
		lastName 				= last;
		socialSecurityNumber 	= ssn;
		setGrossSales(sales);
		setCommisionRate(rate);
		//setBaseSalary(salary);
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
	
	public void setBaseSalary(double salary){
		
		if(salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be > = 0.0");
	}
	
	public double getBaseSalary(){
		
		return baseSalary;
	}
	
	//calculate earnings
	public double earning(){
		return baseSalary + (commissionRate * grossSales);
	}
	
	//return String representation of CommissioEmployee object
	@Override // indicates that this method overrides a superclass method
	public String toString(){
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
				"commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales,
				"commission rate", commissionRate,
				"base salary", baseSalary);
	}
	
}








