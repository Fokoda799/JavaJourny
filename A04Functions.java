import java.util.Scanner;

public class A04Functions {

    public static void main(String[] args) {
        // 1. Function to check if a number is even or odd
        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Function to check if a number is even or odd
            System.out.print("Enter a number to check if it is even: ");
            int number = scanner.nextInt();
            boolean isEvenResult = isEven(number);
            System.out.println("Check if " + number + " is even: " + isEvenResult);
            
            // 2. Function to find the maximum of three numbers
            System.out.print("Enter three numbers to find the maximum: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int max = findMax(a, b, c);
            System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + max);
            
            // 3. Function to calculate the area of a circle
            System.out.print("Enter the radius of a circle to calculate its area: ");
            double radius = scanner.nextDouble();
            double area = calculateArea(radius);
            System.out.println("The area of a circle with radius " + radius + " is: " + area);
            
            // 4. Function to print a greeting
            System.out.print("Enter your name: ");
            String name = scanner.next();
            greet(name);
        }
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static int findMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static double  calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }
}
