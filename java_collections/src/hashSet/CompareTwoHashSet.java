package hashSet;

import java.util.HashSet;

public class CompareTwoHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet();
		
		hs.add(27);
		hs.add(86);
		hs.add(62);
		hs.add(54);
		hs.add(32);
		hs.add(18);
		hs.add(23);
		
		HashSet<Integer> hs1 = new HashSet();
		
		hs1.add(58);
		hs1.add(25);
		hs1.add(13);
		hs1.add(64);
		hs1.add(43);
		hs1.add(31);
		hs1.add(23);
		
		for (Integer h : hs1) {
			System.out.println(hs.contains(h));
		}

	}

}
