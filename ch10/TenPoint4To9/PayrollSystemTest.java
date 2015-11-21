package javaLab.ch10.TenPoint4To9;

public class PayrollSystemTest {
	
	public static void main(String[] args){
		
		SalariedEmployee salariedEmployee =
		new SalariedEmployee("EmpOne fName", "EmpOne lName", "SE-EmpOne", 800.00);
		
		HourlyEmployee hourlyEmployee =
		new HourlyEmployee("EmpTwo fName", "EmpTwo lName", "HE-EmpTwo", 16.75, 40);
	
		CommissionEmployee commissionEmployee = 
		new CommissionEmployee("EmpThree fName", "EmpThree lName", "CE-EmpThree", 10000, .06);
		
		BasePlusCommissionEmployee basePlusCommissionEmployee =
		new BasePlusCommissionEmployee("EmpFour fName", "EmpFour lName", "BPCE-EmpFour", 5000, .04, 300);		
	
		System.out.println("Employee processed individually:\n");
		
		System.out.printf("%s\n %s: $%,.2f \n\n",
				salariedEmployee, "earning", salariedEmployee.earnings());
		
		System.out.printf("%s\n %s: $%,.2f \n\n",
				hourlyEmployee, "earning", hourlyEmployee.earnings());
		
		System.out.printf("%s\n %s: $%,.2f \n\n",
				commissionEmployee, "earning", commissionEmployee.earnings());
		
		System.out.printf("%s\n %s: $%,.2f \n\n",
				basePlusCommissionEmployee, "earning", basePlusCommissionEmployee.earnings());
		
		Employee[] employee = new Employee[4];
		
		employee[0]		= salariedEmployee;
		employee[1]		= hourlyEmployee;
		employee[2]		= commissionEmployee;
		employee[3]		= basePlusCommissionEmployee;
	}

}
