/*
September 11, 2024 ODL
Padilla, Renzo Ymanuel L.
The Use of Variable
*/

public class DeclarationVariables {
    public static void main(String[] args) {

        //Declaration of values
        String name = "Renzo Padilla";
        int age = 18;
        float price = 25.95f;
        char symbol = '$';
        boolean value = true;

        //Numbers for the arithmetic operations
        int fNum = 13;
        int lNum = 9;

        //Arithmetic Operators
        int sum = fNum + lNum;
        int pro = fNum * lNum;
        int quo = fNum / lNum;
        int rem = fNum % lNum;

        //The output of the variables
        System.out.println("Hi, I'm " + name + ".");
        System.out.println("I\"m " + age + " years old.");
        System.out.println("The amount of the item is " + price + symbol + ".");
        System.out.println("The value is " + value + ".");

        //The output of the arithmetic operations
        System.out.println("\nThe sum of " + fNum + " and " + lNum + ", is: " + sum + ",");
        System.out.println("The product of " + fNum + " and " + lNum + ", is: " + pro + ",");
        System.out.println("The quotient of " + fNum + " and " + lNum + ", is: " + quo + ",");
        System.out.println("and the modulo of " + fNum + " and " + lNum + ", is: " + rem + ".");
    }
}
