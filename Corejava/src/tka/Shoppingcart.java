package tka;

public class Shoppingcart {
	
	void electronics(int price_of_Mobile , int price_of_Mixer) {
		
		float sum= price_of_Mobile + price_of_Mixer;
		float gst=sum+sum*15/100;
		System.out.println("Gst on electronic items : "+gst);
		System.out.println("---------------------------------");
	 
	}
	
	void clothing(int Shirt) {
		
		float sum=Shirt;
		float gst=sum+sum*8/100;
		System.out.println("Gst on clothing items: "+gst);
		System.out.println("---------------------------------");

	}
	
	void food(int fries,int shormaa) {
		
		float sum=fries+shormaa;
		float gst=sum+sum*5/100;
		System.out.println("Gst on food items: "+gst);
		System.out.println("---------------------------------");

		
	}
	
	void total(int price_of_Mobile , int price_of_Mixer , int price_of_shirt , int price_of_fries , int price_of_shormaa ) {
		
		float sum= price_of_Mobile+price_of_Mixer+price_of_shirt+price_of_fries+price_of_shormaa;
		System.out.println("Total price of Shopping Items: "+sum);
		System.out.println("---------------------------------");
	}

}
