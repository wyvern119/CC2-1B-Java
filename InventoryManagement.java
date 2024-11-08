import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] price = new int[10];
        int[]quantity = new int[10];
        
        for (int ctr = 0; ctr < 10; ctr++) {
            System.out.print("Enter Stock Level [" + (ctr+1) + "]: ");
            price[ctr] = input.nextInt();
            
            System.out.print("Enter Stock Quantity [" + (ctr+1) + "]: ");
            quantity[ctr] = input.nextInt();
        }
        for (int ctr = 0; ctr < 10; ctr++) {
            int tValue = price[ctr] * quantity[ctr];
            System.out.println("Total Value[" + (ctr+1) + "]: " + tValue);
        }
    }
}
