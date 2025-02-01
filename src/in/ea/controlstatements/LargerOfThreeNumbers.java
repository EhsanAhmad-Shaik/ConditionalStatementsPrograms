package in.ea.controlstatements;

import java.util.Scanner;

public class LargerOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Enter the No1 :");
		// Taking first value as input from user
		a = sc.nextInt();
		
		System.out.println("Enter the No2 :");
		// Taking second value as input from user
		b = sc.nextInt();
		
		System.out.println("Enter the No3 :");
		// Taking third value as input from user
		c = sc.nextInt();
		
		//Condition to check the bigger value
		if (a>b  && a>c) {
			System.out.println("No1 " + a + " is Bigger");
		} 
		
		else if (b>a && b>c) {
			System.out.println("No2 " + b + " is Bigger");
		}
		else {
			System.out.println("No3 " + c + " is Bigger");
		}
		sc.close();
	}

}
