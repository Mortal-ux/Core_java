
public class finally_catch {

	public static void main(String[] args) {
		try {
			int a[]= {1,2,3,4,5,6,7,8};
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally{
			System.out.println("This is Finally Block");
		}
		System.out.println("Program End");
	}

}

