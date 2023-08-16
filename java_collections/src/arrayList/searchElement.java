package arrayList;

import java.util.ArrayList;

public class searchElement {

	public static void main(String[] args) {
		// search element

		ArrayList al = new ArrayList();
		
		al.add("hi");
		al.add(10);
		al.add('a');
		al.add(25);
		al.add("red");
		
		System.out.println(al);
		
		if(al.contains("hi")) {
			System.out.println("present in arraylist");
		}else
		    System.out.println("not present");
		
		
	}

}
