package javaLab.ch10.TenPoint4To9;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary;
	
	BasePlusCommissionEmployee(String first, String last, String ssn, 
			double sales, double rate, double salary){
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary);
	}
	
	public void setBaseSalary(double salary){
		baseSalary = salary;
	}
	
	public double getBaseSalary(){
		return baseSalary;
	}
	
	@Override
	public double earnings(){
		return getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString(){
		return String.format("%s %s;  %s : $%.2f",
				"base-salary", super.toString(),
				"base salary", getBaseSalary());
	}
	
	
}
