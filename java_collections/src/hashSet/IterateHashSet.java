package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {

	public static void main(String[] args) {
	  // iterate hashset 
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(89);
		hs.add(23);
		hs.add(98);
		hs.add(44);
		hs.add(54);
		hs.add(90);
		
		Iterator i=hs.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
