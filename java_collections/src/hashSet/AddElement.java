package hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AddElement {

	public static void main(String[] args) {
         HashSet  s = new HashSet();
         
         s.add("@");
         s.add("cat");
         s.add("dog");
         s.add("lion");
         s.add("cow");
         
         ArrayList al = new ArrayList(s);
         
       
         System.out.println(al);
         
     

	}

}
