package javaLab.ch9.NinePoint10And11;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args){
		
		//instantiate BasePlusCommissionEmpolyee object
		BasePlusCommissionEmployee employee  = new BasePlusCommissionEmployee(
				"Nine", "Point 10 and 11", "333-33-3333", 5000, .04, 300);
		
		System.out.println("Employee information obtained by get method:\n");
		System.out.printf("%s %s \n", "First name is", employee.getFirstName());
		System.out.printf("%s %s \n", "Last name is", employee.getLastName());
		System.out.printf("%s %s \n", "Social security number is", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales());
		System.out.printf("%s %.2f\n", "Commission rate is", employee.getCommissionRate());
		System.out.printf("%s %.2f\n", "Base Salary iss", employee.getBaseSalary());
		
		employee.setBaseSalary(1000);
		employee.setFirstName("Qasim");
		employee.setlastName("Rafique");
		System.out.printf("\n%s: \n \n %s \n", "Updated employee information obtained by toString", employee.toString());
	}
}

