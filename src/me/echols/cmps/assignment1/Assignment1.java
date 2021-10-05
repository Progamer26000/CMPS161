//Samuel Echols September 28 2021 Assignment1

package me.echols.cmps.assignment1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your shoe size (ex: 12)");
		int shoeSize = scanner.nextInt();

		System.out.println("Please enter the year that you were born (ex: 2003");
		int birthYear = scanner.nextInt();

		int num1 = shoeSize * 5;
		int num2 = (num1 + 50) * 20;
		int result = num2 + 1020 - birthYear;

		System.out.println("Result: " + result);
	}

}