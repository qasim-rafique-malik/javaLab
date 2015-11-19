package javaLab.ch8.EightPoint7and8and9;

public class Employee {
	
	
	private String firstName;
	private String lastName;
	private Date dateBirth;
	private Date dateHire;
	
	public Employee(String first, String last, Date dateOfBirth, Date dateOfHire){
		firstName 		= first;
		lastName 		= last;
		dateBirth 		= dateOfBirth;
		//dateHire 		= dateOfHire;
		checkDateOfHireAndBirthValidation(dateOfHire,dateOfBirth);	
	}
	
	public void checkDateOfHireAndBirthValidation(Date DOH, Date DOB){
		
		//System.out.printf("\n year of birth %s\n",DOB.getYear());
		if(!(DOH.getYear() > DOB.getYear())){
			throw new IllegalArgumentException(
					"year of hire should not be less then year of birth");
		}else{
			dateBirth 		= DOB;
			dateHire 		= DOH;
		}
		
	}
	
	public String toString(){
		return String.format("%s, %s Hired: %s Birthday: %s", 
				lastName, firstName, dateHire, dateBirth );
	}
	
	/* this is the default code in the example
	public Employee(String first, String last, Date dateOfBirth, Date dateOfHire){
		firstName 		= first;
		lastName 		= last;
		dateBirth 		= dateOfBirth;
		dateHire 		= dateOfHire;	
	}
	
	public String toString(){
		return String.format("%s, %s Hired: %s Birthday: %s", 
				lastName, firstName, dateHire, dateBirth );
	}
	*/

}
