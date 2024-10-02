/*
Padilla, Renzo Ymanuel L.
October 2, 2024
Lab Challenge 4: Grocery Store Discount Calculator
*/

import java.util.Scanner;

public class GroceryDiscountPadilla {
    public static void main(String[] args) {
        
     //declaration of the scanner
     Scanner input = new Scanner(System.in);
     
     //declaration of variables to be used for calculating and displaying discounts
     double amount, discount, finPrice;
     
     //this is to be used to remove the precision point in the final price
     int x;
     
     //prompts the user to enter the amount purchased
     System.out.print("Enter the total purchase amount: PHP ");
     
     //takes the input of the user to be used
     amount = input.nextInt();
     
     //system for checking the discount based on the amount entered
     if (amount < 1000) {
         //displays the amount of the discount
         System.out.println("Discount applied: 0%");
         
         //converts the double into int to remove precision points
         x = (int) amount;
         
         //prints the final price
         System.out.println("Final price after discount: PHP " + x);
     } else if (amount >= 1000 && amount <= 5000) {
         //displays the amount of the discount
         System.out.println("Discount applied: 5%");
         
         //calculates the discount of the entered amount
         discount = amount * 0.05;
         finPrice = amount - discount;
         
         //converts the double into int to remove precision points
         x = (int) finPrice;
         
         //prints the final price
         System.out.println("Final price after discount: PHP " + x);
     } else if (amount >= 5001 && amount <= 10000) {
         //displays the amount of the discount
         System.out.println("Discount applied: 10%");
         
         //calculates the discount of the entered amount
         discount = amount * 0.10;
         finPrice = amount - discount;
         
         //converts the double into int to remove precision points
         x = (int) finPrice;
         
         //prints the final price
         System.out.println("Final price after discount: PHP " + x);
     } else if (amount >= 10001) {
         //displays the amount of the discount
         System.out.println("Discount applied: 15%");
         
         //calculates the discount of the entered amount
         discount = amount * 0.15;
         finPrice = amount - discount;
         
         //converts the double into int to remove precision points
         x = (int) finPrice;
         
         //prints the final price
         System.out.println("Final price after discount: PHP " + x);
    }
    }
}
