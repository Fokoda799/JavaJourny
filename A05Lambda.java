public class A05Lambda {

    @FunctionalInterface
    interface MathOperation {
        int opeartion(int a, int b);
    }

    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println("Sum of 5 and 3: " + add.opeartion(5, 3));
        System.out.println("Difference of 5 and 3: " + subtract.opeartion(5, 3));
        System.out.println("Product of 5 and 3: " + multiply.opeartion(5, 3));
        System.out.println("Quotient of 5 and 3: " + divide.opeartion(5, 3));

        

    }
}
