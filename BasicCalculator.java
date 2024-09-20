/*
Padilla, Renzo Ymanuel L.
September 20, 2024
Basic Calculator
*/


//Imported the scanner for the program to take numbers from the user.
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        
        //Declaration of the values Scanner and int
        Scanner sc = new Scanner(System.in);
        int fNum, sNum;
        
        /*
        Prompting the user to enter numbers
        The variables are initialized by taking the input from the scanner
        */
        System.out.print("Enter first number: ");
        fNum = sc.nextInt();
        System.out.print("Enter second number: ");
        sNum = sc.nextInt();
        
        /*
        Declaration of the formula variables
        Initialization of the formula variables by adding the formula
        */
        int sum, dif, pro, quo, mod;
        sum = fNum + sNum;
        dif = fNum - sNum;
        pro = fNum * sNum;
        quo = fNum / sNum;
        mod = fNum % sNum;
        
        //The basic display of the arithmetic operations
        System.out.println("\nThe sum is " + sum);
        System.out.println("The difference is " + dif);
        System.out.println("The product is " + pro);
        System.out.println("The quotient is " + quo);
        System.out.println("The remainder is " + mod);
        
        //The numbers entered and the calculated output will be displayed here, ending the program.
        System.out.println("\nChallenge:");
        System.out.println("The sum of " + fNum + " and " + sNum + " is " + sum);
        System.out.println("The difference of " + fNum + " and " + sNum + " is " + dif);
        System.out.println("The product of " + fNum + " and " + sNum + " is " + pro);
        System.out.println("The quotient of " + fNum + " and " + sNum + " is " + quo);
        System.out.println("The remainder of " + fNum + " and " + sNum + " is " + mod);
    }
}
