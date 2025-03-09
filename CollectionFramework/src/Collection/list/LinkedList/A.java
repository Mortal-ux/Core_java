package Collection.list.LinkedList;

import java.util.*;

public class A {

	public static void main(String[] args) {

		
		LinkedList<String> kabbaddiPlayerList=new LinkedList<String>();
		kabbaddiPlayerList.add("Pawan Sehrawat");
		kabbaddiPlayerList.add("Naveen Kumar");
		kabbaddiPlayerList.add("Pradeep Narwal");
		
		Vector<String> womencricketerList= new Vector<String>();
		womencricketerList.add("Meethali Raj");
		womencricketerList.add("Harleen Deol");
		womencricketerList.add("Smriti Mandhana");

		
		
		Stack<String> menCricketerList=new Stack<String>();
		menCricketerList.add("Rohit Sharma");
		menCricketerList.add("KL Rahul");
		menCricketerList.add("Jasprit Bumrah");
		
		
		List<String> listForVisa=new LinkedList<String>();
		listForVisa.addAll(kabbaddiPlayerList);
		listForVisa.addAll(womencricketerList);
		listForVisa.addAll(menCricketerList);
		System.out.println(listForVisa);
		
		Iterator<String> itr=listForVisa.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
