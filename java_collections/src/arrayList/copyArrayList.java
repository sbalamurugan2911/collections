package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class copyArrayList {

	public static void main(String[] args) {
		// copying arraylist
		
		
		ArrayList al1 = new ArrayList();
		
		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(10);
		
		ArrayList al2 = new ArrayList();
		
		al2.add("a");
		al2.add("b");
		al2.add("c");
		al2.add("d");
		
		System.out.println("before copy");
		System.out.println(al1);
		System.out.println(al2);
		
		Collections.copy(al1, al2);
		
		System.out.println("after copy");
		System.out.println(al1);
		System.out.println(al2);
		
		
		
		
		

	}

}
