package Array;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		int a[]= {6,9,4,7,3,2};
		int Even=0;
		int Odd=0;
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) {
				Even=Even+a[i];
			}
			else {
				Odd=Odd+a[i];
			}
			
			
			
		}
		System.out.println("Addition of Even Numbers:" +Even);
		System.out.println("Addition of Odd Numbers:" +Odd);
		

	}

}
