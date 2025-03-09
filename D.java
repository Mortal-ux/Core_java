
public class D {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			try {
				int a=20; int b=0;
				int c=a/b;
				System.out.println(c);
				}
					catch(ArithmeticException a) {
						System.out.println("cannot devide by zero ");
					}
					String n=null;
					System.out.println(n.length());
					}
				
					catch(NullPointerException e) {
					System.out.println("cannot find length");
					}
					
			}
}
