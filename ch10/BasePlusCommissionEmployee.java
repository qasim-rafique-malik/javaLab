package javaLab.ch10;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String first, String last,
		String ssn, double sales, double rate, double salary)
	{
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary);
		
	}
	
	//set base Salary
	public void setBaseSalary(double salary){
		if(salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >= 0.0");
	}
	
	//return base salary
	public double getBaseSalary(){
		return baseSalary;
	}
	
	//calculate earnings by overriding superclass method earnings with @Override
	@Override
	public double earnings(){
		return this.getBaseSalary() + super.earnings();
	}
	
	//Overriding toString method with @Override
	@Override
	public String toString(){
		
		return String.format("%s \n %s: %.2f ",
				super.toString(),
			"base salary", this.getBaseSalary() );
		
		
	}
}
	


