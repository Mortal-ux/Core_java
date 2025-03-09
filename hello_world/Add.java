package hello_world;

public class Add {

	public static void main(String[] args) {
		
		int add=0;
		int x[]= {18,45,33,65,87,19,56,77};
		{
		for(int i=0;i<x.length;i++)
		{
			add=add+x[i];
		}
			System.out.println("Addition of Given Numbers: "+add);
		}
	}
}
