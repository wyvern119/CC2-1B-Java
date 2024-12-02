/*
Padilla, Renzo Ymanuel L.
Final Challenge 1: Inventory Management
November 8, 2024
*/

//imports scanner
import java.util.Scanner;

//imports packages for displaying the price properly
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class InventoryManagement {
    public static void main(String[] args){
        
        //version 1: predefined
        //declaration of arrays
        int[] price = {200, 100, 350, 320, 190, 140, 40, 50, 65, 120};
        int[] quantity = {10, 6, 8, 3, 7, 9, 3, 7, 6, 1};
        int sum = 0;
        
        //initialization of the price format
        DecimalFormat formatter = new DecimalFormat("₱#,##0.00");
        
        //loops through the arrays to calculate the total value and displays output
        for (int ctr = 0; ctr < 10; ctr++) {
            int tValue = price[ctr] * quantity[ctr];
            
            //takes the calculated total value of each stock and converts into proper pricing format
            BigDecimal amt = new BigDecimal(tValue);
            String currStr = formatter.format(amt);
            
            //displays the total value of each stock
            System.out.println("Stock [" + (ctr+1) + "]: " + quantity[ctr] + " " + price[ctr]);
            System.out.println("Total Value[" + (ctr+1) + "]:" + currStr + "\n");
            
            //adds each total to sum for displaying total value of all stocks
            sum = sum + tValue;
        }
        
        //takes the calculated total value and converts into proper pricing format
        BigDecimal amt = new BigDecimal(sum);
        String currStr = formatter.format(amt);
        
        //diplays the total value with proper price format
        System.out.println("Total Valule of All Items: " + currStr);
        
        
        /*
        //version 2: with user input
        //declaration of scanner for storing input
        Scanner input = new Scanner(System.in);
        
        //initialization of arrays
        int[] price = new int[10];
        int[] quantity = new int[10];
        int sum = 0;
        
        //initialization of the price format
        DecimalFormat formatter = new DecimalFormat("₱#,##0.00");
        
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
        
            //takes the calculated total value of each stock and converts into proper pricing format
            BigDecimal amt = new BigDecimal(tValue);
            String currStr = formatter.format(amt);
            
            //displays total value of each stock
            System.out.println("Total Value[" + (ctr+1) + "]: " + tValue);
        
             //adds each total to sum for displaying total value of all stocks
            sum = sum + tValue;
        }
        System.out.println("Total Valule of All Items: " + sum);
        */
    }
}
