/*
Padilla, Renzo Ymanuel L.
Novebemer 24, 2024
Final Challenge 3: Grades Tracker
 */

//imports scanner
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        /*
        //version 1: pre-defined
        //initialization of student and grades array
        String[] students = {"Yugo", "Tristepin", "Ruel", "Evangelyne", "Amalia"};
        int[][] grades = {
                {85, 88, 79},
                {85, 87, 89},
                {90, 82, 79},
                {94, 82, 81},
                {94, 81, 78},
        };


        //initialization of sum for calculating ang getting average
        int sum = 0;

        //loop for adding the sum and calculating the average of each students and their grades
        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 3; row++) {

                //adds the array into a sum
                sum = sum + grades[col][row];

                //if the limit is reached, prints the student's name and their average
                if (row == 2) {

                    //calculates and prints the student's name and average
                    double average = (double) sum / 3;
                    System.out.println("Student " + students[col] + "'s Average: " + String.format( "%.1f", average));

                    //resets the sum and the loop till it reaches the last student
                    sum = 0;
                }
            }
        }
         */

        //version 2: user input
        //declaration of the arrays
        String[] students = new String[5];
        int[][] grades = new int[5][3];

        //initialization of the scanner variable
        Scanner input = new Scanner(System.in);

        //initialization of sum for calculating ang getting average
        int sum = 0;

        //loop for taking in the name and grades of each student for 3 subjects
        for (int col = 0; col < 5; col++) {

            //asks and stores the student name
            System.out.print("Enter Student Name: ");
            students[col] = input.next();

            for (int row = 0; row < 3; row++) {

                //asks and stores the grade for the 3 subjects
                System.out.print("Enter Grade for Subject " + (row+1) + ": ");
                grades[col][row] = input.nextInt();
                }
            }

        //loop for calculating the average of each students
        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 3; row++) {

                //adds the array into a sum
                sum = sum + grades[col][row];

                //if the limit is reached, prints the student name and average
                if (row == 2) {

                    //calculates and prints the student's name and average
                    double average = (double) sum / 3;
                    System.out.println("Student " + students[col] + "'s Average: " + String.format( "%.1f", average));

                    //resets the sum and the loop till it reaches the last student
                    sum = 0;
                }
            }
        }
    }
}
