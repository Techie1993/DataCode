package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOps {

	public static void main(String[] args) {
		

		int data[]= {11,22,13};
		
		for(int i=0;i<=data.length-1;i++) {
			int square=data[i] * data[i];
			System.out.println(square);
		}
		
		System.out.println("Duplicate Removal\n");
		
		int Data[]= {22,14,14,15,26};
		
		ArrayList<Integer>Res=new ArrayList<Integer>(Arrays.asList(22,14,14,15,26));	
		Res.stream().distinct().forEach(System.out::println);
		
		
		
		
		
		
	
		
		
	}
}
