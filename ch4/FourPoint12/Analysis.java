package javaLab.ch4.FourPoint12;
//Qasim rafique _9-22-2015
//fig 4.12

//importing libary
import java.util.Scanner;

public class Analysis{//class body start
	
	public static void main(String[] args){//main body start
		
		//declaring variables
		int pass; 
		int fail;
		int studentcount;
		int result;
		
		//Reference variables
		Scanner input 		= new Scanner(System.in);
		
		//initionlizing variables
		pass 				= 0;
		fail 				= 0;
		studentcount 		= 1;
		
		while(studentcount <= 10){
			
			System.out.print("Enter result (1 = pass, 2 = fail):");
			result 			= input.nextInt();
			
			if(result == 1){
				pass 		= pass + 1;
				
			}
			else{
				fail 		= fail + 1;
			}
			
			studentcount 	= studentcount + 1; 
		}
		
		System.out.printf("Total pass student = %d\n", pass);
		System.out.printf("Total fail student = %d\n", fail);
		
		if(pass > 8){
			System.out.print("Bouns to instrctror");
			
		}
		
		input.close();
	}//main body end
	
}//class body end