package Array;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		int add=0;
		int a[]=new int[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Please Enter your Number"  + i + "Index of number");
			a[i]=sc.nextInt();
			add=add+a[i];
		}
		System.out.println("Addition of Elements "+add);
		
	
	}

}
