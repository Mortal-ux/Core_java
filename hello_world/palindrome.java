package hello_world;

public class palindrome {

	public static void main(String[] args) {
		
		String s="AbA";
		String r= null;
		
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
			
		}
		if(s.equals(s)) {
			System.out.println("Its Palindrome");
		}
		else
		{
			System.out.println("its not Palindrome");
		}
		
		
	}

}
