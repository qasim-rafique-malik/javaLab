package javaLab.ch7.SevenPoint5;

public class SumArray {
	
	public static void main(String[] args){//main block start
		
		int[] array = {11,22,33,44,55,66,77,88,99,11};
		
		int total = 0 ;
		
		for(int count = 0; count<array.length; count++)
			total += array[count];
		
		System.out.print("Total of array Elements = "+total);
		
	}//main block end

}
