package practiseproblem;

import java.util.regex.Pattern;

/**
 * 
 * @author kastu
 *
 */
public class UserRegistrationProgram {
	/*
	 * Defining lambda expression & pattern for email If pattern matches then
	 * printing email is valid
	 */
	public static void main(String[] args) {

		userInput fn = (email)->{
            boolean check = Pattern.matches("^([a-z]{3}[.][a-z]{3}@[a-z]{2}[.][a-z]{2}[.][a-z]{2})$",email);
            if (check == true) {
                System.out.println("Email is Valid");
            }else
                System.out.println("Enter valid email");
        };
        fn.validUser("abc.xyz@bl.co.in");
	}
}
