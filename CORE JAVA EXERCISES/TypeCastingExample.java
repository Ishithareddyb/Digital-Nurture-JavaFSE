public class TypeCastingExample {
    public static void main(String[] args) {

        double decimalNumber = 12.75;
        int intValue = (int) decimalNumber;

        System.out.println("Double value: " + decimalNumber);
        System.out.println("After casting to int: " + intValue);

        int wholeNumber = 25;
        double doubleValue = (double) wholeNumber;

        System.out.println("Int value: " + wholeNumber);
        System.out.println("After casting to double: " + doubleValue);
    }
}