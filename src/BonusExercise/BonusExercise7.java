package BonusExercise;

//Tim Pieniazek - Bonus Exercise 7

import java.util.Scanner;

public class BonusExercise7 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String input;
		String yes;
		
		do {
			System.out.print("Enter some text: ");
			input = scnr.nextLine();
			System.out.println(input);
			System.out.print("Would you like to continue (y/n)? ");
			yes = scnr.next();
		} while (yes.equalsIgnoreCase("y"));

	}

}
