/*
Padilla, Renzo Ymanuel L.
October 10, 2024
Lab Challenge 7: Password Validation System
 */

//imports the scanner
import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {

        //declaration of the variables
        Scanner input = new Scanner(System.in);
        String pass;
        boolean valid = false;

        //initialization of the loop using do-while
        do {
            //prompts the user to enter the password
            System.out.print("Enter your password: ");
            pass = input.next();

            //checks if the input is invalid
            if (pass.length()<8) {
                valid = false;
                System.out.println("Password must have at least 8 letters, one capital letter, and one number!");

                //continues the program to check
                continue;
            }
            //the use of for loop for checking if it contains capital letters and numbers
            for (int i = 0; i < pass.length(); i++) {
                char c = pass.charAt(i);

                //checks whether the symbols in the input is valid or not
                if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {

                    //registers the user password as valid
                    valid = true;
                } else {
                    System.out.println("Only letters and digits are acceptable!");
                    valid = false;
                    break;
                }
            }
        }
        //if the password is valid, it ends the program
        while(!valid);
        System.out.println("Your password is valid!");
    }
}

