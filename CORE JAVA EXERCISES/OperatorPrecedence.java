public class OperatorPrecedence {
    public static void main(String[] args) {

        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;

        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);

        System.out.println("\nExplanation:");
        System.out.println("Multiplication is performed before addition.");
        System.out.println("Parentheses have the highest precedence.");
    }
}