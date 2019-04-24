import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a numeric grade: ");

		int grade = scan.nextInt();

		if (grade <= 100 && grade >= 0) {

			if (grade >= 85) {
				System.out.println("A");
			} else if (grade >= 70) {
				System.out.println("B");
			} else if (grade >= 60) {
				System.out.println("C");
			} else if (grade >= 50) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}

		} else {
			System.out.println("The number is not an valid numerical grade.");
		}
		System.out.println("Goodbye!");

		// this should be the end of my program
		scan.close();

	}

}
