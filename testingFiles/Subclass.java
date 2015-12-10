package javaLab.testingFiles;

public class Subclass extends SuperClass {

	public Subclass(){
		super.functionOne(12);
	}
	
	@Override
	public void publicfunction(){
		System.out.printf("i am in SubClass publicfunction");
	}

	public static void functionOne(int test){
		System.out.printf("i am in Subclass %d", test);
	}
}
