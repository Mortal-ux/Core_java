package Collection.list.ArrayList;

import java.util.ArrayList;

public class Vehicle {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add(" VOLVO ");
		cars.add(" BMW ");
		cars.add(" MERCEDEZE ");
		cars.add(" FORD ");
		
		System.out.println(cars);
		System.out.println("********************************************************");
		
		cars.add(1, " TOYOTA ");
		System.out.println(cars);
		System.out.println("*********************************************************");
		
		cars.get(3);
		System.out.println(cars.get(3));
		System.out.println("*********************************************************");
		
		cars.set(2," FERRARI ");
		System.out.println(cars.set(2, " FERRARI "));
		System.out.println("*********************************************************");

		
		cars.remove(3);
		System.out.println(cars);
		System.out.println("*********************************************************");
		
		cars.clear();
		System.out.println(cars);
		System.out.println("*********************************************************");

	}

}
