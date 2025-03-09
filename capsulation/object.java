package capsulation;

public class object {

	public static void main(String args[]) {
		
		student s1=new student();
		s1.setname("Shubham");
		s1.setroll(45);
		s1.setdepartment("Microbiology");
		s1.setmob(8010100802l);
		
		System.out.println(s1.getname());
		System.out.println(s1.getroll());
		System.out.println(s1.getdepartment());
		System.out.println(s1.getmob());
		
	}
	
}
