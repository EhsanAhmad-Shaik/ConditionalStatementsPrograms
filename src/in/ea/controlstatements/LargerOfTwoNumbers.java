package in.ea.controlstatements;

import java.util.Scanner;

public class LargerOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Enter the No1 :");
		// Taking first value as input from user
		a = sc.nextInt();
		
		System.out.println("Enter the No2 :");
		// Taking first value as input from user
		b = sc.nextInt();
		
		//Condition to check the bigger value
		if (a > b) {
			System.out.println("No1 " + a + " is Bigger");
		} else {
			System.out.println("No2 " + b + " is Bigger");
		}
		sc.close();
	}

}
