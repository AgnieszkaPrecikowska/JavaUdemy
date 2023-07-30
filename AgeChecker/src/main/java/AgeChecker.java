import java.util.Scanner;

//Ask the user about their age, and if they are under 18,
// display a message on the screen saying that they cannot buy alcohol.
// If they are over 18, thank them for their purchase.
public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Thank you for your purchase.");
        }

        else if (age < 18 && age >= 0) {
            System.out.println("You cannot buy alcohol!");
        }

        else {
            System.out.println("Incorrect value!");
        }
    }
}