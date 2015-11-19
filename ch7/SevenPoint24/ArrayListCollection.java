package javaLab.ch7.SevenPoint24;

//importing library
import java.util.ArrayList;
public class ArrayListCollection {

	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.printf("Display list with counter control loop\n");
		
		list.add("colors");
		list.add("red");
		list.add(0,"red");
		
		for(int count = 0; count < list.size(); count++)
			System.out.printf("%s  ",list.get(count));
	}
}
