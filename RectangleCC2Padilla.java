/*
Padilla, Renzo Ymanuel L.
September 9, 2024
Laboratory Challenge 2
*/

public class RectangleCC2Padilla {
    public static void main(String[] args) {

        //The given values of the garden in terms of: Length and Width
        int length, width, area, perimeter;
        length = 5;
        width = 3;

        //The calculations needed to find the area and perimeter of the garden
        area = length * width;
        perimeter = 2 * (length + width);

        //The output/display of the length, width, area, and the perimeter of the garden
        System.out.println("The length of the garden is " + length + " meters, and the width of the garden is " + width + " meters.");
        System.out.println("The area of the garden is " + area + " meters.");
        System.out.println("Whilst the perimeter of the garden is " + perimeter + " meters.");
    }
}
