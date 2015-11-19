package javaLab.ch8.EightPoint17;

class PackageData {
	
	//instance variables
	int number;
	String string;
	
	public PackageData(){
		number 		= 0;
		string 		= "Hello";
	}
	
	public String toString(){
		return String.format("Number: %d; String: %s ", number, string);
	}

}
