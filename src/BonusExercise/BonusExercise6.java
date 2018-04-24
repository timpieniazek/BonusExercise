package BonusExercise;

//Tim Pieniazek - Bonus Exercise 6

import java.util.Scanner;

public class BonusExercise6 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String yes;
		
		do {
			System.out.println("Hello World!");
			System.out.print("Would you like to continue (y/n)? ");
			yes = scnr.next();
		} while (yes.equalsIgnoreCase("y"));

	}

}
