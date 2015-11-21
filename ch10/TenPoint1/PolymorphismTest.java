package javaLab.ch10.TenPoint1;

public class PolymorphismTest {
	
	public static void main(String[] args){
		
		CommissionEmployee commissionEmployee = new CommissionEmployee(
				"emp1","CP","CP1",2000, .7
				);
		
		BasePlusCommissionEmployee basePlusCommissionEmployee =
				new BasePlusCommissionEmployee(
						"emp2","BPCE","BPCE1",1000, .04, 500
						);
		
		System.out.printf("%s %s:\n \n %s \n\n",
				"Call CommissionEmployee's toString with supercalss reference",
				"to superclass object",
				commissionEmployee.toString()
				);
		
		
		System.out.printf("%s %s:\n \n %s \n\n",
				"Call CommissionEmployee's toString with subcalss reference",
				"to subclass object",
				basePlusCommissionEmployee.toString()
				);
		
		
		CommissionEmployee  commissionEmployee2=  basePlusCommissionEmployee;
		System.out.printf(
				"%s %s:\n \n %s \n\n",
				"Call BasePlusCommissionEmployee's toString with superclass",
				"reference to subclass object",
				commissionEmployee2.toString()
				);
		
		
		
	}

}

