import java.util.Scanner;

import java.util.Scanner;

public class CreateVariable{
    public static void main(String[] args) {
        // a) Declare variables c, thisIsAVariable, q76354 and number to be of type int
        int c, thisIsAVariable, q76354, number;

        // b) Prompt the user to enter an integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        // c) Input an integer and assign the result to int variable value
        number = input.nextInt();

        // d) Print "This is a Java program" on one line in the command window
        System.out.println("This is a Java program");

        // e) Print "This is a Java program" on two lines in the command window
        System.out.printf("%s%n%s%n", "This is a Java", "program");

        // f) If the variable number is not equal to 7, display "The variable number is not equal to 7"
        if (number != 7) {
            System.out.println("The variable number is not equal to 7");
        }

        input.close();
    }
}