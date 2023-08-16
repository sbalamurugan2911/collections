package arrayList;

import java.util.ArrayList;

public class retrieveElementAtArrayList {

	public static void main(String[] args) {
		// get element from arraylist
		
		ArrayList <Integer> al = new ArrayList <Integer>();
		
		al.add(23);
		al.add(45);
		al.add(76);
		al.add(43);
		al.add(53);
		al.add(21);
		
		System.out.println(al);
		
		Integer num1=al.get(0);
		System.out.println("first element of arraylist "+num1);
		
		Integer num5=al.get(4);
		System.out.println("5th element of arraylist "+num5);
		
	

	}

}
