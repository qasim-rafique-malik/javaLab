package javaLab.ch7.SevenPoint22;

//import library 
import java.util.*;

public class ArrayManipulation {
	public static void main(String[] args){
		
		//sorting array into ascending order
		
			double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
			Arrays.sort(doubleArray);
			System.out.printf("\ndoubleArray: ");
			for(double value : doubleArray )
				System.out.printf("%.1f ",value);
			
		
		//fill 10 element array with 7s
		
			int[] filledIntArray = new int[10];
			Arrays.fill(filledIntArray, 7);
			displayArray(filledIntArray,"fillIntArray");
		
		
		//copy array intArray into array intArrayCopy
		
			int[] intArray = {1, 2, 3, 4, 5, 6};
			int[] intArrayCopy = new int[intArray.length];
			System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
			displayArray(intArray,"intArray ");
			displayArray(intArrayCopy,"intArrayCopy ");
		
		
		//compare intArray and intArrayCopy for equality
			
			boolean b = Arrays.equals(intArray, intArrayCopy);
			System.out.printf("\nintArray %s intArrayCopy\n",
					(b ? "==": "!="));
			
		// compare intArray and filledIntArray for equality
			
			b = Arrays.equals(intArray, filledIntArray);
			System.out.printf("\nintArray %s filledIntArray\n",
					(b ? "==": "!="));
			
		//search intArray for the value 5
			int location = Arrays.binarySearch(intArray, 5);
			
			if(location >= 0)
				System.out.printf("Found 5 at element %d in intArray\n",location);
			else
				System.out.printf("5 not found in array");
			
			//search intArrau for value 8763
			if(location >= 0)
				System.out.printf("Found 8763 at element %d in intArray\n",location);
			else
				System.out.printf("8763 not found in array");
	}
	
	public static void displayArray(int[] array, String discription){
		
		System.out.printf("\n%s:", discription);
		
		for(int value : array)
			System.out.printf("%d ",value);
	}

}
