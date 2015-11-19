package javaLab.ch7.SevenPoint3;

//this class is use to test array in java

public class IntiArray {
	
	//entering point of application 
	public static void main(String[] args){//main block start
		
		//declare and initialize array
		//int[] array1 = new int[3]; 
		int[] array = {22,33,44,55,66,77};// this is another way to declare and initialize array
		
		System.out.printf("%s%8s\n","Index","Value");
		
		for(int count = 0; count < array.length; count++){
			System.out.printf("%d%8d\n", count, array[count]);
		}
		
		
	}//main block end

}
