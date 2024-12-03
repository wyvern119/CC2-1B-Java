/*
Padilla, Renzo Ymanuel L.
Decmeber 3, 2024
Final Challenge 5: ExceptionHandling
*/

//imports packages for displaying the proper price
import java.math.BigDecimal;
import java.text.DecimalFormat;

//imports package for storing user input
import java.util.Scanner;

//imports package for checking invalid input error
import java.util.InputMismatchException;

//creation of custom exception for exceeded amount
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String errorMessage) {
        super(errorMessage);
    }
}

//creation of custom exception for checking quantity
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String errorMessage) {
        super(errorMessage);
    }
}

public class ErrorHandling {
    
    //exception checks whether the amount entered has exceeded or not
    static void ExceededAmount (double withdraw, double account) throws InsufficientFundsException {
        if (withdraw > account) {
            throw new InsufficientFundsException("\nError! Amount Exceeded!");
        } else {
            System.out.println("\nFunds Successfully Withdrawn!");
        }
    }

    //exception checks whether the amount is less than 0 or greater than the available amount
    static void InvalidQuantity(int amount, int quantity) throws InvalidQuantityException {
        if (amount <= 0 || amount > quantity) {
            throw new InvalidQuantityException("\nError! Invalid Quantity");
        } else {
            System.out.println("Item Added to Cart!");
        }
    }

    public static void main(String[] args){

        /*
        
        //initialization of scanner
        Scanner input = new Scanner(System.in);
        
        //declaration of variable for storing user input
        double withdraw;
        
        //initialization of pre-defined amount of account
        double account = 10000;
        
        //initialization of proper pricing format
        DecimalFormat formatter = new DecimalFormat("₱#,##0.00");
        
        try {
            
            //converts the variable into proper price format
            BigDecimal amt = new BigDecimal(account);
            String currStr = formatter.format(amt);
            
            //asks the user to enter amount
            System.out.println("Welcome! Your total account has: " + currStr);
            System.out.print("Enter desired amount of money to withdraw: ");
            withdraw = input.nextInt();
            
            //checks whether the input exceeded the account
            ExceededAmount(withdraw, account);
            
            //if it didn't exceed, subtracts input to account
            account = account - withdraw;
            
            //catches various errors
        } catch (InsufficientFundsException e) {
            //catches error when amount entered exceeds
            System.out.println("Error! Amount Exceeded");
        } catch (InputMismatchException e) {
            //catches error when input is anything but numbers
            System.out.println("Error! Invalid Input");
        } finally {
            
            //converts the variable into proper price format
            BigDecimal amt = new BigDecimal(account);
            String currStr = formatter.format(amt);
            
            //displays the total account
            System.out.println("Account Total Amount: " + currStr);
            System.out.println("Thank you for using our services!");
        }
        */

        //initialization of scanner
        Scanner input = new Scanner(System.in);

        //initialization of pre-defined amount of account
        int quantity = 5;
        int amount =0;

        try {

            //asks the user to enter amount to put in cart
            System.out.println("Steam Deck OLED 1 TB");
            System.out.println("Price: ₱41,595");
            System.out.println("Quantity: " + quantity);
            System.out.print("\nAdd to Cart: ");
            amount = input.nextInt();

            //checks whether the input is greater or lower than the input
            InvalidQuantity(amount, quantity);

            //catches various errors
        } catch (InvalidQuantityException e) {
            //catches error when amount entered exceeds or is lesser than what is available
            System.out.println("Error! Amount Invalid");
            amount = 0;
        } catch (InputMismatchException e) {
            //catches error when input is anything but numbers
            System.out.println("Error! Invalid Input");
        } finally {

            //displays the total amount of cart
            System.out.println("\nCart Amount: " + amount + " Item/s");
            System.out.println("Thank you for shopping!");
        }
    }
}

