package javaLab.ch8.EightPoint7and8and9;

public class EmployeeTest {
	
	public static void main(String[] args){
		Date birth = new Date(7,24,1949);
		Date hire = new Date(3,12,1988);
		
		try{
			Employee employee = new Employee(
					"Bob", "Blue", birth, hire);
			System.out.println(employee);
		}catch(IllegalArgumentException e) {
			System.out.print(e.getMessage());
		}
	}

}
