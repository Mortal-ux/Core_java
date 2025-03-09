package multithreading;

public class BMI {
	
	
	void m1(double weight,double height) {
		
		
		double BMItotal =weight / (height * 2);
		
		System.out.println(" BMI TOTAL IS : "+BMItotal);
	}

	public static void main(String[] args) {
		
		BMI b = new BMI();
		b.m1(70, 7.50);

		
	}

}
