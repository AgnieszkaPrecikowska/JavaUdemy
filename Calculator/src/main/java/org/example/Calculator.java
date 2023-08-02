//Calculator
package org.example;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;

        System.out.println("Result of adding the numbers you provided is: " + addition + ".");
        System.out.println("Result of substracting the numbers you provided is: " + substraction + ".");
        System.out.println("Result of multiplying the numbers you provided is: " + multiplication + ".");
        System.out.println("Result of dividing the numbers you provided is: " + division + ".");
        System.out.println("Result of modulo the numbers you provided is: " + mod + ".");

        }
    }
