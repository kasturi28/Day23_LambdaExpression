package practiseproblem;

import java.util.regex.Pattern;

public class UserRegistrationProgram {

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration program");
		firstName fn = (name) -> {
			boolean check = Pattern.matches("([A-Z][a-z]{3,})", name);
			if (check == true) {
				System.out.println("Firstname is Valid");
			} else
				System.out.println("Enter valid name");
		};
		fn.validUser("Kasturi");
	}
}
