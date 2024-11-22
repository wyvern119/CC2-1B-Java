/*
Padilla, Renzo Ymanuel L.
Final Challenge 2: Weather Tracker
November 19, 2024
*/

//imports scanner
import java.util.Scanner;

public class WeatherTracker {
    public static void main (String[] args) {

        /*
        //version 1: pre-defined
        //declaration of 2D array
        int[][] cityWeather = {
                {23, 29, 20, 24, 21, 22, 18},
                {20, 30, 22, 21, 24, 23, 19},
                {26, 18, 20, 19, 24, 20, 21},
        };

        //declaration of variables for getting the sum and highest temperature
        int sum = 0;
        int tempHigh = 0;

        //this part of code calculates both the average and highest temperature
        //loop for city array
        for (int cityCtr = 0; cityCtr < 3;) {
            //loops through the temperature array to calculate average and check highest temperature
            for (int ctr = 0; ctr < 7; ctr++) {

                //each loop adds the current stored array into the sum and vice versa
                sum = sum + cityWeather[cityCtr][ctr];

                //checks if the current stored array is higher than the stored value
                if (cityWeather[cityCtr][ctr] > tempHigh) {
                    tempHigh = cityWeather[cityCtr][ctr];
                }

                //checks if the array has reached the max amount of array
                if (ctr == 6) {

                    //calculates the average
                    double avg = (double) sum / 7;

                    //prints out the output immediately per current city
                    System.out.println("Average Temperature of City " + (cityCtr+1) + ": " + avg);
                    System.out.println("Highest Temperature Recorded of City " + (cityCtr+1) + ": " + tempHigh + "\n");

                    //resets the sum and highest temperature back to 0
                    sum = 0;
                    tempHigh = 0;

                    //adds the city counter and loops back to another city
                    cityCtr++;
                }
            }
        }

         */

        //version 2: user input
        //declaration of scanner
        Scanner input = new Scanner(System.in);

        //initialization of 2D array
        int[][] cityWeather = new int[3][7];

        //declaration of variables for getting the sum and highest temperature
        int sum = 0;
        int tempHigh = 0;

        //this part of code stores the user input into arrays
        //loops for storing the temperature for current city
        for (int cityCtr = 0; cityCtr < 3;) {

            //loops for storing temperature into array
            for (int ctr = 0; ctr < 7; ctr++) {
                System.out.print("Enter the Daily Temperature of Day " + (ctr+1)+ " for City " + (cityCtr+1) + ": ");
                cityWeather[cityCtr][ctr] = input.nextInt();

                //checks if the array has reached the max amount of array
                if (ctr == 6) {
                    //if true, adds to the city counter and restarts the loop but on another city
                    cityCtr++;
                }
            }
        }

        //this part of code calculates both the average and highest temperature
        //loop for city array
        for (int cityCtr = 0; cityCtr < 3;) {
            //loops through the temperature array to calculate average and check highest temperature
            for (int ctr = 0; ctr < 7; ctr++) {

                //each loop adds the current stored array into the sum and vice versa
                sum = sum + cityWeather[cityCtr][ctr];

                //checks if the current stored array is higher than the stored value
                if (cityWeather[cityCtr][ctr] > tempHigh) {
                    tempHigh = cityWeather[cityCtr][ctr];
                }

                //checks if the array has reached the max amount of array
                if (ctr == 6) {

                    //calculates the average
                    double avg = sum / 7;

                    //prints out the output immediately per current city
                    System.out.println("Average Temperature of City " + (cityCtr+1) + ": " + avg);
                    System.out.println("Highest Temperature Recorded of City " + (cityCtr+1) + ": " + tempHigh + "\n");

                    //resets the sum and highest temperature back to 0
                    sum = 0;
                    tempHigh = 0;

                    //adds the city counter and loops back to another city
                    cityCtr++;
                }
            }
        }
    }
}
