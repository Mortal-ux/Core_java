package hello_world;

public class length {

	public static void main(String[] args) {
		String s="Hello World";
		String S1=" ";
		int length=s.length();
		for(int i=(length-1);i>=0;i--)
		{
			S1=S1+s.charAt(i);
		}
		
		System.out.print(S1);

	}

}

	