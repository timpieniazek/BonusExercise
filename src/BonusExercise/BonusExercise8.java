package BonusExercise;

import java.util.Scanner;

public class BonusExercise8 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final String CONTINUE = "%nWould you like to continue (y/n)? ";
		String yes1;
		String yes2;
		int exercise;
		
		do {
		System.out.print("Please choose an exercise number 2-5: ");
		exercise = scnr.nextInt();
		scnr.nextLine();
			switch (exercise) {
					case 2:
						System.out.printf("%n~Bonus Exercise 2~%n");
						do {
							BonusExercise2();
							System.out.printf(CONTINUE);
							yes2 = scnr.next();
							System.out.println();
						} while (yes2.equalsIgnoreCase("y"));
						break;
					case 3:
						System.out.printf("%n~Bonus Exercise 3~%n");
						do {
							BonusExercise3();
							System.out.printf(CONTINUE);
							yes2 = scnr.next();
							System.out.println();
						} while (yes2.equalsIgnoreCase("y"));
						break;
					case 4:
						System.out.printf("%n~Bonus Exercise 4~%n");
						do {
							BonusExercise4();
							System.out.printf(CONTINUE);
							yes2 = scnr.next();
							System.out.println();
						} while (yes2.equalsIgnoreCase("y"));
						break;
					case 5:
						System.out.printf("%n~Bonus Exercise 5~%n");
						do {
							BonusExercise5();
							System.out.printf(CONTINUE);
							yes2 = scnr.next();
							System.out.println();
						} while (yes2.equalsIgnoreCase("y"));
						break;
					default:
						break;
			}
			System.out.printf("Would you like to choose another exercise? ");
			yes1 = scnr.next();
			System.out.println();
			
		} while (yes1.equalsIgnoreCase("y"));

	}

	private static void BonusExercise2() {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scnr.nextInt();
		System.out.println(input);
	}

	private static void BonusExercise3() {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double input = scnr.nextDouble();
		double output = input + 0.5;
		System.out.println(output);
	}

	private static void BonusExercise4() {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double input1 = scnr.nextDouble();
		System.out.print("Enter another number: ");
		double input2 = scnr.nextDouble();
		double output = input1 + input2;
		System.out.println(output);
	}

	private static void BonusExercise5() {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double input1 = scnr.nextDouble();
		System.out.print("Enter another number: ");
		double input2 = scnr.nextDouble();
		double output = input1 * input2;
		System.out.println(output);
	}

}
