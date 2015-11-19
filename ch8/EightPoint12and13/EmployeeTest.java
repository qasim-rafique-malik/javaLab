package javaLab.ch8.EightPoint12and13;

public class EmployeeTest{
	
	public static void main(String[] args){
		
		System.out.printf("Employee count before initialization: %d \n",Employee.getCount());
		System.out.printf("Employee myCount before initialization--: %d \n",Employee.myCount);
		//Employee emp = new
		Employee emp1 = new Employee("Susan", "Baker");
		Employee emp2 = new Employee("Bub", "Blue");
		
		System.out.println("Employee count after initialization:");
		System.out.printf("via emp1.getCount(): %d\n", emp1.getCount());
		System.out.printf("via emp2.getCount(): %d\n", emp2.getCount());
		System.out.printf("via Employee.getCount(): %d\n", 
			Employee.getCount());
			
		System.out.printf("Employee 1: %s %s \n Employee 2: %s %s \n",
			emp1.getFirstName(), emp1.getLastName(),
			emp2.getFirstName(), emp2.getLastName());
				System.out.printf("Employee myCount after initialization--: %d \n",
				Employee.myCount);
			
			emp1 = null;
			emp2 = null;
	}
}
