/*
Padilla, Renzo Ymanuel L.
October 10, 2024
Lab Challenge No. 5: Restaurant Order System
 */

import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        //declaration of the scanner
        Scanner input = new Scanner(System.in);

        //initialization of the variables
        int choice, bPrice, fPrice, sPrice, icPrice, amount, total;

        //prints the menu of the restaurant and their prices
        System.out.println("\t\t\t MENU");
        System.out.println("==============================");
        System.out.println("1. Burger\t\t\t - PHP 100\n2. Fries\t\t\t - PHP 50\n3. Soda\t\t\t\t - PHP 30\n4. Ice Cream\t\t - PHP 45\n5. Exit");
        System.out.println("==============================");

        //prompts the user to enter the menu number
        System.out.print("Enter the menu number of your choice: ");

        //takes the choice of the user
        choice = input.nextInt();

        //decides what the input of the user will be
        switch (choice) {
            case 1: {
                //declaration of the price to be used for calculating total amount
                bPrice = 100;

                //prompts the user to enter the quantity of the item
                System.out.print("\nEnter the quantity: ");

                //takes the amount entered by the user
                amount = input.nextInt();

                //formula of the total amount
                total = bPrice * amount;

                //displays the ordered item and the total amount of the item
                System.out.println("\nYou ordered Burger");
                System.out.println("Total Amount: " + total + " PHP");
                System.out.println("==============================");
                System.out.println("\tThank you for ordering!");

                //stops the program
                break;
            }
            case 2: {
                //declaration of the price to be used for calculating total amount
                fPrice = 50;

                //prompts the user to enter the quantity of the item
                System.out.print("\nEnter the quantity: ");

                //takes the amount entered by the user
                amount = input.nextInt();

                //formula of the total amount
                total = fPrice * amount;

                //displays the ordered item and the total amount of the item
                System.out.println("\nYou ordered Fries");
                System.out.println("Total Amount: " + total + " PHP");
                System.out.println("==============================");
                System.out.println("\tThank you for ordering!");

                //stops the program
                break;
            }
            case 3: {
                //declaration of the price to be used for calculating total amount
                sPrice = 30;

                //prompts the user to enter the quantity of the item
                System.out.print("\nEnter the quantity: ");

                //takes the amount entered by the user
                amount = input.nextInt();

                //formula of the total amount
                total = sPrice * amount;

                //displays the ordered item and the total amount of the item
                System.out.println("\nYou ordered Soda");
                System.out.println("Total Amount: " + total + " PHP");
                System.out.println("==============================");
                System.out.println("\tThank you for ordering!");

                //stops the program
                break;
            }
            case 4: {
                //declaration of the price to be used for calculating total amount
                icPrice = 45;

                //prompts the user to enter the quantity of the item
                System.out.print("\nEnter the quantity: ");

                //takes the amount entered by the user
                amount = input.nextInt();

                //formula of the total amount
                total = icPrice * amount;

                //displays the ordered item and the total amount of the item
                System.out.println("\nYou ordered Ice Cream");
                System.out.println("Total Amount: " + total + " PHP");
                System.out.println("==============================");
                System.out.println("\tThank you for ordering!");

                //stops the program
                break;
            }
            case 5: {
                //prints out the closing message by entering the exit choice
                System.out.println("==============================");
                System.out.println("\tThank you for ordering!");

                //stops the program
                break;
            }
        }
    }
}