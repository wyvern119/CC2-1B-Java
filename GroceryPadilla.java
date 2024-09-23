/*
Padilla, Renzo Ymanuel L.
September 23, 2024
CC2 - Grocery Shopping Calculator
 */

import java.util.Scanner;

public class GroceryPadilla {
    public static void main(String[] args) {

        //addition of scanner to take user input
        Scanner input = new Scanner(System.in);

        //declaration of values to be used for the calculations
        //double is used for calculating percentages
        double pItem1, pItem2, pItem3, qItem1, qItem2, qItem3, price1, price2, price3, sTotal, dTotal, sTax, finalTotal;

        //this is where the program will ask the user for input
        System.out.print("Enter the price of the first item: ");
        pItem1 = input.nextInt();

        System.out.print("Enter the quantity of the first item: ");
        qItem1 = input.nextInt();

        System.out.print("Enter the price of the second item: ");
        pItem2 = input.nextInt();

        System.out.print("Enter the quantity of the second item: ");
        qItem2 = input.nextInt();

        System.out.print("Enter the price of the third item: ");
        pItem3 = input.nextInt();

        System.out.print("Enter the quantity of the third item: ");
        qItem3 = input.nextInt();

        //calculations for the total of the items
        price1 = pItem1 * qItem1;
        price2 = pItem2 * qItem2;
        price3 = pItem3 * qItem3;

        //subtotal for the sum of all the items
        sTotal = price1 + price2 + price3;

        //discount calculated with the use of percentage converted to decimal
        dTotal = sTotal * 0.05;

        //sales tax calculated with subtracting the subtotal and discount before being multiplied with the tax
        sTax = (sTotal - dTotal) * 0.12;

        //final total with the subtotal reduced by discount and added by tax
        finalTotal = (sTotal - dTotal) + sTax;

        //this is where all the calculations done are displayed
        System.out.println("\nSubtotal: " + sTotal);
        System.out.println("Discount: " + dTotal);
        System.out.println("Sales Tax: " + sTax);
        System.out.println("Final Total: " + finalTotal);
    }
}
