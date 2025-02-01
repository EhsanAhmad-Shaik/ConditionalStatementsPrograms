package in.ea.controlstatements;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	// Using 3-numbers
//		int a, b, c;
//		
//		System.out.println("Enter the A :");
//		// Taking A value as input from user
//		a = sc.nextInt();
//		System.out.println("Enter the B :");
//		// Taking B value as input from user
//		b = sc.nextInt();
//	
//		c=a;
//		a=b;
//		b=c;
//		
//		System.out.println("A : " + a);
//		System.out.println("B : " + b);
	
		
		// Using 2-numbers
		int a, b;
		
		System.out.println("Enter the A :");
		// Taking A value as input from user
		a = sc.nextInt();
		System.out.println("Enter the B :");
		// Taking B value as input from user
		b = sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		
		sc.close();
	}

}
