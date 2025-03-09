package hello_world;

public class trim {


	public static void main(String[] args) {
		String s="  India is my country     ";
		String p="  India";
		String S1=s.trim(); //used to remove initial and last spaces of string ;
		System.out.println(S1);

		String S2=S1.toUpperCase();
		System.out.println(S2);
		
		System.out.println(S2.toLowerCase());
		
		String name="Shubham";
		String surname="Shubham";
		
	    System.out.println(name.concat(surname));
	    
	    System.out.println(name.concat(surname).length());	
	    
	    int gap=surname.compareTo(name);
	    System.out.println(gap);
	    
	    int i=surname.compareToIgnoreCase(name);
	    System.out.println(i);
	    
	    boolean b=s.contains(p);
	    System.out.println(b);
	    
	    boolean b1=s.contentEquals(surname);
	    System.out.println(b1);
	    
		
		boolean b2=s.endsWith(p);
		System.out.println(b2);
		
		boolean b3=name.equals(surname);
		System.out.println(b3);
	    		
	    		
	    		boolean b4=name.toUpperCase().equals(surname.toUpperCase());
	    		System.out.println(b4);
	    		
	}

}
