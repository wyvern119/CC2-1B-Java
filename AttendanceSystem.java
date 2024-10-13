/*
Padilla, Renzo Ymanuel L.
October 9, 2024
Lab Challenge 6: Attendance System
 */

//import of scanner
import java.util.Scanner;

public class AttendanceSystem {
    public static void main(String[] args) {

        //declaration of scanner and variables to be used for the loop
        Scanner input = new Scanner(System.in);
        int count, totalAmount, tPresent, tAbsent;
        String present;

        //prompts the user to enter the amount of students
        System.out.print("Enter the total number of students: ");
        totalAmount = input.nextInt();

        //initialization of the count to be used for the loop
        count = 1;
        tPresent = 0;
        tAbsent = 0;

        //start of loop, executes until the count is equal to the amount given by the user
        while (count <= totalAmount) {

            //prompts the user if the student is present or not
            System.out.print("Is student " + count + " present? (Y/N): ");
            present = input.next();

            //decides based on the choice of the user, adds on to the present and absent tally
            if (present.equals("Y")) {
                tPresent++;
            } else if (present.equals("N")) {
                tAbsent++;
            }

            //after the condition is met, the count is added
            count++;

            //if the count is over the total amount, the program stops and presents the total amount of present and absent.
            if (count > totalAmount) {
                System.out.println("Total Present: " + tPresent);
                System.out.println("Total Absent: " + tAbsent);
                break;
            }
        }
    }
}
