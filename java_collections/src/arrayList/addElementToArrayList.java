package arrayList;

import java.util.ArrayList;

public class addElementToArrayList {

	
	
	public static void main(String[] args) {
		// add element to arrayList at specified position
		
		ArrayList <String> al = new ArrayList();
		
		al.add("red");
		al.add("white");
	    al.add("green");
	    al.add("black");
	    al.add("yellow");
	    
	    System.out.println(al);
		
	    al.add(0, "pink");

	    System.out.println(al); // add element
	    
	    al.set(0,"blue");
	    
	    System.out.println(al);  // replace element

	}

}
