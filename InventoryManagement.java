/*
Padilla, Renzo Ymanuel L.
Final Challenge 1: Inventory Management
November 8, 2024
*/

//imports scanner
import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args){
        
        //version 1: predefined
        /*
        //declaration of arrays
        int[] price = {200, 100, 350, 320, 190, 140, 40, 50, 65, 120};
        int[] quantity = {10, 6, 8, 3, 7, 9, 3, 7, 6, 1};
        
        //loops through the arrays to calculate the total value and displays output
        for (int ctr = 0; ctr < 10; ctr++) {
            int tValue = price[ctr] * quantity[ctr];
            System.out.println("Stock [" + (ctr+1) + "]: " + quantity[ctr] + " " + price[ctr]);
            System.out.println("Total Value[" + (ctr+1) + "]:" + tValue + "\n");
        }
        */
        
        //version 2: with user input
        //declaration of scanner for storing input
        Scanner input = new Scanner(System.in);
        
        //initialization of arrays
        int[] price = new int[10];
        int[] quantity = new int[10];
        
        //loop for storing the stock quantity and cost
        for (int ctr = 0; ctr < 10; ctr++) {
            System.out.print("Enter Stock Price [" + (ctr+1) + "]: ");
            price[ctr] = input.nextInt();
            
            System.out.print("Enter Stock Quantity [" + (ctr+1) + "]: ");
            quantity[ctr] = input.nextInt();
        }
        
        //loops through the arrays to calculate the total value and displays output
        for (int ctr = 0; ctr < 10; ctr++) {
            int tValue = price[ctr] * quantity[ctr];
            System.out.println("Total Value[" + (ctr+1) + "]: " + tValue);
        }
    }
}
