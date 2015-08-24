// library files block start
import java.util.Scanner;
// library files block end

//chapter exercise
public class ex2{
    public static void main(String[] arg){
		//exercise 2.3
		
		/*
		    //you have to remove one type of declaration 
			//othervice compiler give you an error.
		
		// a)
		int c, thisIsAVariable, q76354, number;
		//or
		int c;
		int thisIsAVariable;
		int q76354;
		int number;
		*/
		
		//-----------------
		
		/*
		//b)
		System.out.println("Enter an integer:");
		*/
		
		//-------------------
		
		/*
		//c)
		Scanner takeInput = new Scanner(System.in);
		int value = takeInput.nextInt();
		System.out.printf("value of variable value is = %d", value);
		*/
		
		//----------------
		
		/*
		//d)
		System.out.println("this is the java program");
		*/
		
		//---------------

		/*
		//e)
		System.out.println("This is a java\nprogram");
		*/
		
		//-----------
		
		/*
		//f)
		System.out.printf("%s\n%s", "This is a java", "program");
		*/
		
		//-------------------
		
		//g)
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the value:");
		int number = input.nextInt();
		if(number != 7){
			System.out.printf("The variable is not equal to 7");
		}
		
    }
}