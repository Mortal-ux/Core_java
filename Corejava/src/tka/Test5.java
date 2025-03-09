package tka;

public class Test5 {

	public static void main(String[] args) {
		
		Shoppingcart s1=new Shoppingcart();
		
		s1.electronics(5000, 4500);
		s1.clothing(700);
		s1.food(320, 240);
		s1.total(500, 4500, 700, 320, 240);	
	
	}

}
