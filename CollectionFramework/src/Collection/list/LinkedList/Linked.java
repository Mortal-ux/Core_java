package Collection.list.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		
		LinkedList<Comparable> l=new LinkedList<Comparable>();
		
		l.add("Shubham");
		l.add(12);
		l.add("karad");
		l.add("Aditya");
		
		System.out.println(l);
		
		l.set(2, "Satara");
		System.out.println(l);
		
		
		l.remove(1);
		System.out.println(l);
		
		Iterator<Comparable> itr=l.iterator();
		
		while(itr.hasNext()) {
			Object o=itr.next();
			System.out.println(o);
		}

	}

}
