package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MoblieObject {

	public static void main(String[] args) {
		// add mobile object to map with price and remove mobile price more than 15000
		
		
		Map<String,Integer>m = new HashMap();
		
		m.put("redmi",9000);
		m.put("realme",10000);
		m.put("oppo", 12000);
		m.put("vivo", 14000);
		m.put("samsung",16000);
		m.put("micromax",8000);
		m.put("poco", 7000);
		m.put("iphone",100000);
		m.put("oneplus",20000);
		m.put("iphonemini",40000);
		
		System.out.println(m);
		
		List <Map.Entry<String,Integer>> me  =new ArrayList(m.entrySet());
		
		System.out.println("after remove moblie above price 15000 ");
		for(Map.Entry<String,Integer> s : me) {
			if(s.getValue()<15000) {
				System.out.print(s+" ");
			}
		}
		
		
		
		

	}

}
