package Collection.Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class SS {

	public static void main(String[] args) {

		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Shubham");
		ts.add("Aditya");
		ts.add("Sangram");
		ts.add("Aniket");
		ts.add("Adarsh");
		
		System.out.println(" NAME : "+ts);
		
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
