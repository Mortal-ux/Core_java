package tka;

public class Employee {
	
	int EId=11;
	String ename="Shubham";
	int sal=60000;
	
	void bonus(int amt) {
		
		System.out.println("Start of bonus method...");
		sal = sal+amt;
		System.out.println(sal);
		
		System.out.println("End of bonus method...");
				
	}
	
	void monthlysal() {
		System.out.println("---------------------------");
		System.out.println("Start of monthly method...");
		System.out.println(sal);
		System.out.println("End of monthly method...");
		System.out.println("---------------------------");
		
		
	}

}
