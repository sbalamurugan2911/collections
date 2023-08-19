package hashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet();
		
		hs.add(45);
		hs.add(27);
		hs.add(42);
		hs.add(13);
		hs.add(36);
		hs.add(15);
		System.out.println(hs);
		TreeSet <Integer>t= new TreeSet(hs);
System.out.println(t);
	}

}
