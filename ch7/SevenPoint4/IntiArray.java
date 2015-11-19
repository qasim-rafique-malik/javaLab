package javaLab.ch7.SevenPoint4;

//This class is use to apply calculation and store result in array index

public class IntiArray {
	
	public static void main(String[] args) {//main block start
		
		final int ARRAY_LENGTH = 10;
		
		int[] array = new int[ARRAY_LENGTH];
		
		System.out.printf("%s%8s\n", "Index", "Value");
		

		
		for(int count= 0; count < array.length; count++){
			array[count] = 3 + 3 * count;
			System.out.printf("%d%8d\n", count+1, array[count]);
		}
		
		
		//for(int count= 0; count < array.length; count++)
			
		
		
	}//main block end

}
