package hello_world;

public class string {
	
	public void pickChar()
	{
		
		String s = "Hello World";
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf("a"));
		
		char a = s.charAt(4);
		System.out.println(a);
		
		for(int i=0; i>s.length();i--)
		{
			char d = s.charAt(i);
			System.out.println(d);
		}
	}

	public static void main(String[] args) {
		
		 string s = new string();
		 s.pickChar();
	}

}
