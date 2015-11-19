package javaLab.ch7.MulitiDimaentionalArray;

public class MultiArray {
	
	private int row;
	private int column;
	
	public MultiArray(int ... args){
		
		this.row = args[0];
		this.column = args[1];
		
	}
	public void MultiDExArray(){
		
		int[][] MuitiArray1 = {{22,42,55,11},{32,54,4,7,8},{98,12,87,88,90,0,3,1}};
		
		for(int[] test : MuitiArray1){
			for(int test2 : test)
				System.out.printf("%3d",test2);
			System.out.println();
		}
		
		/*for(int row = 0; row < MuitiArray1.length; row++){
			
			for(int column = 0; column < MuitiArray1[row].length; column++){
				System.out.printf("%3d",MuitiArray1[row][column]);
		}
		System.out.println();
		
	}*/	

}
	
	public  void MultiDArray(){
			
			int[][] MuitiArray1 = new int[this.row][this.column];
			
			for(int row = 0; row < MuitiArray1.length; row++){
				
				for(int column = 0; column < MuitiArray1[row].length; column++){
					System.out.printf("%3d",MuitiArray1[row][column]);
			}
			
			System.out.println();
		}	
	
	}
	
	public static void MultiDArrayWithInitializer(){
		
		int[][] MuitiArray1 = {{22,42,55,11},{32,54,4,7,8},{98,12,87,88,90,0,3,1}};
		
		for(int row = 0; row < MuitiArray1.length; row++){
			
			for(int column = 0; column < MuitiArray1[row].length; column++){
				System.out.printf("%3d",MuitiArray1[row][column]);
			}
			
			System.out.println();
			
		}	

	}
	
	public static void oneDArray(){
		int[] test;
		test = new int[5];
		
		
		for(int i = 0; i < test.length; i++)
			test[i] = i+5;
		
		
		for(int test1 : test)
			System.out.println(test1);
	}
	
	public static void main(String[] args){
		
		
		//oneDArray();
		//MultiDArrayWithInitializer();
		MultiArray MA = new MultiArray(3,4);
		MA.MultiDArray();
		MA.MultiDExArray();
		
	}
	
	
	

}
