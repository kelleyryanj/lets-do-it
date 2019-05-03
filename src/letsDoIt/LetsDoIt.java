package letsDoIt;

import java.util.Scanner;

public class LetsDoIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("What is your first and last name?");
		String firstName = input.nextLine();
		String lastName = input.nextLine();

		int firstNameLength = firstName.length();
		int lastNameLength = lastName.length();

		if (firstNameLength > lastNameLength) {
			System.out.println("Your first name is longer than your last name");
		} else {
			System.out.println("Your last name is longer than your first name.");
		}

		System.out.println(firstName + " " + lastName);
		Boolean gameLoop = true;

		while (gameLoop == true) {

			System.out.println("I have a riddle for you. Where do generals keep their armies?");
			String riddleAnswer = input.nextLine();
			System.out.println(riddleAnswer);
			if (riddleAnswer.toLowerCase().equals("in their sleevies")) {
				System.out.println("Yea, you got it right!!!!");
				gameLoop = false;
			} else {
				System.out.println("Wrong! Try again next time!");
			}
		}
		input.close();
	}
}