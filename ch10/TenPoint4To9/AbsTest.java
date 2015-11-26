package javaLab.ch10.TenPoint4To9;

public class AbsTest {
	
	public static void main(String[] args){
		
		Employee test = new HourlyEmployee("fName", "lName", "ssnCode", 200, 80);
		
		System.out.println(test);
		System.out.printf("earning = $%.2f",test.earnings());
		
		
	}

}
