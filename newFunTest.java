// this class is for tesitng new functing of java

//imporing library block start
import java.util.Scanner;
//importing library block end
class newFunTest { // class body start
	
	static void main(String[] args){ // main method body start
		
		//creating object of Scanner
		Scanner input 		= new Scanner(System.in);
		
		//promting user to enter value
		System.out.print("Enter value : ");
		
		
		// testing Scanner function next
		String testnext		= input.next();
		
		String testnext2		= input.next();
		String testnext3		= input.next();
		String testnext4		= input.next();
		
		//printing value entered by user
		System.out.printf("User entered \n \" %s \"\n", testnext);
		
		System.out.printf("other\n \" %s \"\n", testnext2);
		System.out.printf("next\n \" %s \"\n", testnext3);
		System.out.printf("othernext\n \" %s \"\n", testnext4);
		
		
		
	}// main method body end
	
} // class body end