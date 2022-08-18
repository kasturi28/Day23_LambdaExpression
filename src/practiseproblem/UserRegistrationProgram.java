package practiseproblem;

import java.util.regex.Pattern;

/**
 * 
 * @author kastu
 *
 */
public class UserRegistrationProgram {
	/*
	 * Defining lambda expression & pattern for mobile number If pattern matches then
	 * printing number is valid
	 */
	public static void main(String[] args) {

		userInput fn = (mobileNumber) -> {
			boolean check = Pattern.matches("^([91]{2} [0-9]{10})$", mobileNumber);
			if (check == true) {
				System.out.println("Mobile number is Valid");
			} else
				System.out.println("Enter valid mobile number");
		};
		fn.validUser("91 8421731310");
	}
}
