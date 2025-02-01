package in.ea.controlstatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

// Creating the calculator using the SWITCH-CASE
		
		int a, b, result;
		String option = "";
		String yn;
		// Scanner class for taking the input from the User
		Scanner sc = new Scanner(System.in);

		do {
			// Taking the first input number
			System.out.print("Enter the No1 : ");
			a = sc.nextInt();

			// Taking the second input number
			System.out.print("Enter the No2 : ");
			b = sc.nextInt();

			System.out.println("Choose the operation : +, -, *, /");
			option = sc.next();

			switch (option) {
			case "+":
				result = a + b;
				System.out.println("Addition of " + a + "+" + b + " is : " + result);
				break;
			case "-":
				result = a - b;
				System.out.println("Subraction of " + a + "-" + b + " is : " + result);
				break;
			case "*":
				result = a * b;
				System.out.println("Multiplication of " + a + "*" + b + " is : " + result);
				break;
			case "/":
				result = a / b;
				System.out.println("Division of " + a + "/" + b + " is : " + result);
				break;

			default:
				System.out.println("Wrong Option Choosen");
			}

			System.out.println("");
			System.out.print("Do you want to Continues Calculation [Y/N] :");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		System.err.println("***ThankYou***.....End.....");
		sc.close();
	}

}
