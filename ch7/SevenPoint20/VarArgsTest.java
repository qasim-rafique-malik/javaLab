package javaLab.ch7.SevenPoint20;

public class VarArgsTest {
	
	public static double average(double...numbers){
		
		double total = 0.0;
		System.out.printf("numbers length = %f",numbers[0]);
		for(double number : numbers)
			total += number;
		
		
		return total;
	}
	public static int average(int...numbers){
			
			int total = 0;
			System.out.printf("numbers length = %d",numbers.length);
			for(int number : numbers)
				total += number;
			
			
			return total/numbers.length;
		}
	public static void main(String[] args){
		
		double d1 = 20.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;
		int me = 20;
		int me2 = 30;
		int me3 = 40;
		
		System.out.printf("average = %f\n",average(me, d1,d2,d3,d4));
		System.out.printf("average = %d\n",average(me,me3,me2));
		
	}

}
