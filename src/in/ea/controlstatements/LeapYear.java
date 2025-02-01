package in.ea.controlstatements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		
		System.out.println("Enter the Year :");
		// Taking  value as input from user
		year = sc.nextInt();
		
		//Condition to check the Leap-Year or Not 
		if ((year%400==0) || (year%4==0 && year%100!=0)) {
			System.out.println("Year " + year + " is Leap-Year");
		} else {
			System.out.println("Year " + year + " is Not Leap-Year");
		}
		sc.close();
	}

}
