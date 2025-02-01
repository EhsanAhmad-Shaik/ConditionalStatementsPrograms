package in.ea.controlstatements;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("Enter the No :");
		// Taking  value as input from user
		a = sc.nextInt();
		
		//Condition to check the Even Or Odd value
		if (a%2==0) {
			System.out.println("No " + a + " is Even");
		} else {
			System.out.println("No " + a + " is Odd");
		}
		sc.close();
	}

}
