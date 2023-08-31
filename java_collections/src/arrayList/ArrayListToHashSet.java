package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListToHashSet {
	
	// without using constructor

	public static void main(String[] args) {
		List l= new ArrayList();
		
		l.add(2);
		l.add(5);
		l.add(8);
		l.add(2);
		l.add(8);
		l.add(5);
		
		System.out.println(l);
		
		
		
		Set s = new HashSet();
		
		s.addAll(l);
		
		System.out.println(s);
		
		
		

	}

}
