package Collection.Set.HashSet;

import java.util.*;
public class Shopping {

	public static void main(String[] args) {

		HashSet<Integer> s=new HashSet<Integer>();
		
		s.add(143);
		s.add(302);
		s.add(496);
		s.add(512);
		s.add(999);
		
		System.out.println("Numbers : "+s);
		
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
