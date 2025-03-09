
public class Finaly {

	public static void main(String[] args) {
		
		try {
			int a[]= {1,2,3,4,5,6,7,8};
			System.out.println(a[4]);
		}
		finally{
			System.out.println("This is Finally Block");
		}
		System.out.println("Code Executed Successfully");
	}

}
