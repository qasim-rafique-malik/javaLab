package javaLab.ch6.SixPoint6;
//this class is for test random class

//importing libraries
import java.util.Random;

public class RandomInteger {
	
	public static void main(String[] args){//main body start
		
		//Reference variables
		Random ramdomNum = new Random();
		
		//primitive variables
		int face;
		
		for(int counter = 1; counter<=20;counter++){//for block start
			
			//face = 1 + ramdomNum.nextInt(6);
			face = ramdomNum.nextInt(6);
			System.out.printf("%d",face);
			
			if(counter%5 == 0){
				System.out.println();
			}
					
		}//for block end
		
		
	}//class body end
	

}
