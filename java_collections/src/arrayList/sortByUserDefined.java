package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortByUserDefined {

	public static void main(String[] args) {
		// sort  by user defined
		
		
		Comparator c = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Integer l1=((String) o1).length();
				Integer l2=((String) o2).length();
				
				if(l1>l2) {
					return 1;
				}else if (l1<l2) {
					return -1;
				}
				return 0;
			}
			
			
		};
		
		List <String> l = new ArrayList();
		
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("four");
		l.add("five");
		l.add("six");
		
		System.out.println(l);
		
		Collections.sort(l, c);
		
		System.out.println(l);
	}

}
