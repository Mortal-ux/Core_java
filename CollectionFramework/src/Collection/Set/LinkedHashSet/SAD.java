package Collection.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SAD {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		
		lhs.add(121);
		lhs.add(997);
		lhs.add(544);
		lhs.add(957);
		lhs.add(155);
		
		System.out.println(lhs);
		

		Iterator<Integer> itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}


