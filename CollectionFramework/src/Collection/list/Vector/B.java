package Collection.list.Vector;

import java.util.Vector;

public class B {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		
		v.add(23);
		v.add(45);
		v.add(60);
		v.add(77);
		v.add(92);

		for (int i = 0; i < v.size(); i++) {
			
			System.out.println(v);
			
		}
	}

}
