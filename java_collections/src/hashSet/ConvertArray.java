package hashSet;

import java.util.HashSet;

public class ConvertArray {

	public static void main(String[] args) {
		// convert hashset to array
		
		
		HashSet hs = new HashSet();
		
		hs.add(45);
		hs.add(51);
		hs.add(78);
		hs.add(25);
		hs.add(31);
		hs.add(12);
		hs.add(57);
		hs.add(28);
		
		System.out.println(hs);
		
		
		
		Integer []a=new Integer[hs.size()];
	     hs.toArray(a);
		
		for(Integer i : a) {
			System.out.println(i);
		}
	
	}

}
