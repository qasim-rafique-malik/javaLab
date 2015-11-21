package javaLab.ch10.TenPoint4To9;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;
	
	public SalariedEmployee(String first, String last, String ssn, double salary){
		
		super(first, last, ssn);
		setWeeklySalary(salary);
	}
	
	public void setWeeklySalary(double salary){
		if(salary >= 0.0)
			weeklySalary = salary;
		else
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
	}
	
	public double getWeeklySalary(){
		return weeklySalary;
	}
	
	@Override
	public double earnings(){
		return getWeeklySalary();
	}
	
	@Override
	public String toString(){
		return String.format("Salaried employee: %s \n %s: $%.2f",
		super.toString(), "weekly salary", getWeeklySalary() );
	}
}
