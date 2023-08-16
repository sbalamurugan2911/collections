package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList {

	public static void main(String[] args) {
		// sort arraylist
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(50);
		al.add(70);
		al.add(80);
		al.add(20);
		al.add(10);
		al.add(90);
		al.add(30);
		al.add(40);
		System.out.println("before sorting");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("after sorting");
		System.out.println(al);
		
		

	}

}
