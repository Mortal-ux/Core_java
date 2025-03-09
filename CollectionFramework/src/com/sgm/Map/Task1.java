package com.sgm.Map;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {

		//HashMap <Integer,String>hm=new HashMap();
		
//		int a=23;
//		
//		
//		hm.put(2,"Sangram");
//		hm.put(3,"Aditya");
//		hm.put(4,"Aniket");
//		hm.put(5,"Adarsh");
//		hm.put(6,"Amey");
//		
//		String o=(String) hm.get(1);
//		
//		System.out.println(o);
//		
//		//hm.entrySet();
//		
//		for(Entry<Integer, String> e:hm.entrySet()) {
//			
//			System.out.println(e);
//		}
//		
		
LinkedHashMap <Integer,String>hm=new LinkedHashMap();
		
		int a=23;
		
		hm.put(1,"Shubham");
		hm.put(2,"Sangram");
		hm.put(3,"Aditya");
		hm.put(4,"Aniket");
		hm.put(5,"Adarsh");
		hm.put(6,"Amey");
		
		String o=(String) hm.get(1);
		
		System.out.println(o);
		
		for(Entry<Integer,String> e:hm.entrySet()) {
			
			System.out.println(e);
		}
		
		System.out.println(hm.containsKey(1));
		
		Set s=hm.keySet();
		
		System.out.println(s);
		
	}

}
