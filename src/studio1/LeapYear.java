package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for year?");
		int year = in.nextInt();
		
		boolean divisibleBy4 = year % 4 == 0;
		boolean notDivisibleBy100 = year % 100 != 0; 
		boolean divisibleBy400 = year % 400 == 0; 
		
		boolean isLeapYear = divisibleBy400 || (divisibleBy4 && notDivisibleBy100);
		
		System.out.println(isLeapYear); 

	}

}
