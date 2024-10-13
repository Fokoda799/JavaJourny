import java.util.Scanner;

public class A03ConditionalLogic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age >= 12 && age < 20 ) {
            System.out.println("You are a teenager.");
        } else if (age > 19 && age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        if (age > 17) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        if (age > 64) {
            System.out.println("You can retire.");
        } else {
            System.out.print("You cannot retire yet.");
        }

        scanner.close();
    }
}
