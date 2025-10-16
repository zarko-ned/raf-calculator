public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        System.out.println("The sum is: " + result);

        int result2 = calculator.subtract(10,4);
        System.out.println("The difference is: " + result2);

        int result3 = calculator.multiply(6,7);
        System.out.println("The product is: " + result3);

        int result4 = calculator.divide(4,2);
        System.out.println("The quotient is: " + result4);
    }
}
