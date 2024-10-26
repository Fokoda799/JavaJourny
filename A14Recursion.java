public class A14Recursion {
    public static void main(String[] args) {
        // All Recursion algorithms are implemented here

        // Factorial
        System.out.println("Factorial: " + factorial(5));

        // Fibonacci
        System.out.println("Fibonacci: " + fibonacci(5));

        // Tower of Hanoi
        towerOfHanoi(3, 'A', 'C', 'B');
    }

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }
} 