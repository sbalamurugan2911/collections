package arrayList;

import java.util.ArrayList;

public class removeElementAtArrayList {

	public static void main(String[] args) {
		// remove element from arraylist
		
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		
		al.add(12);
		al.add(24);
		al.add(34);
		al.add(51);
		al.add(25);
		al.add(63);
		
		System.out.println(al);
		
		
		
		al.remove(0); // remove first element
		
		System.out.println(al);
		
		
		

	}

}
