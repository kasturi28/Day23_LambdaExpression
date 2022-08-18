package practiseproblem;

import java.util.regex.Pattern;

/**
 * 
 * @author kastu
 *
 */
public class UserRegistrationProgram {
	/*
	 * Defining lambda expression & pattern for password upto rule 4 If pattern matches then
	 * printing password is valid
	 */
	public static void main(String[] args) {

        userInput fn = (password) -> {
            boolean check = Pattern.matches("^([A-Z]{1,}[a-z]{5,}[@#$|]{1}[0-9]{1,})$", password);
            if (check == true) {
                System.out.println("Password is Valid");
            } else
                System.out.println("Enter valid password");
        };
        fn.validUser("Kasturi@28");
	}
}
