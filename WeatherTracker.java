import java.util.Scanner;

public class WeatherTracker {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] cityWeather = new int[3][7];
        int sum = 0;
        int tempHigh = 0;

        for (int cityCtr = 0; cityCtr < 3;) {
            for (int ctr = 0; ctr < 7; ctr++) {
                System.out.print("Enter the Daily Temperature of Day " + (ctr+1)+ " for City " + (cityCtr+1) + ": ");
                cityWeather[cityCtr][ctr] = input.nextInt();
                sum = sum + cityWeather[cityCtr][ctr];
                if (ctr == 6) {
                    cityCtr++;
                }
            }
        }
        for (int cityCtr = 0; cityCtr < 3;) {
            for (int ctr = 0; ctr < 7; ctr++) {
                sum = sum + cityWeather[cityCtr][ctr];
                if (cityWeather[cityCtr][ctr] > tempHigh) {
                    tempHigh = cityWeather[cityCtr][ctr];
                }
                if (ctr == 6) {
                    int avg = sum / 7;
                    System.out.println("Average temperature of City " + (cityCtr+1) + ": " + avg);
                    System.out.println("Highest Temperature Recorded of City " + (cityCtr+1) + ": " + tempHigh);
                    sum = 0;
                    tempHigh = 0;
                    cityCtr++;
                }
            }
        }
    }
}
