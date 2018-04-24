package BonusExercise;

//Tim Pieniazek - Bonus Exercise 4

import java.util.Scanner;

public class BonusExercise4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double input1 = scnr.nextDouble();
		System.out.print("Enter another number: ");
		double input2 = scnr.nextDouble();
		double output = input1 + input2;
		System.out.print(output);
	}

}
