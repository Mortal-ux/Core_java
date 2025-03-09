package Collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Studentlist {
	
	public static void main(String args[]) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Shubham");
		al.add("Aditya");
		al.add("Sangram");
		al.add("Aniket");
		al.add("Adarsh");
		
		//System.out.println(al);
		//System.out.println(al.size());
		//al.set(2,"Shubham");
		//al.remove(2);
		//al.clear();
		//al.clone();
		//Object o= al.clone();
		//System.out.println(o);
		int j=al.indexOf("Adarsh");
		System.out.println(j);
		
		//for(int i=0;i<al.size();i++) 
		//{
			//System.out.println(al.get(i));
			Iterator<String> itr=al.iterator();
			
			while(itr.hasNext()) {
				Object o=itr.next();
				System.out.println(o);
		}
	}

}
