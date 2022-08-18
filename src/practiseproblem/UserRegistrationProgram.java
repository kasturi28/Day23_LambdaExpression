package practiseproblem;

import java.util.regex.Pattern;

/**
 * 
 * @author kastu
 *
 */
public class UserRegistrationProgram {
	/*
	 * Defining lambda expression & pattern for last name If pattern matches then
	 * printing last name is valid
	 */
	public static void main(String[] args) {

		userInput fn = (name) -> {
			boolean check = Pattern.matches("([A-Z][a-z]{3,})", name);
			if (check == true) {
				System.out.println("Last name is Valid");
			} else
				System.out.println("Enter valid name");
		};
		fn.validUser("Pansare");
	}
}
