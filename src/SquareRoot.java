public class SquareRoot implements Operations {

    @Override
    public double operate(double num1, double num2) {
        if (num1 < 0) {
            System.out.println("Error: Cannot take square root of negative number!");
        }
        return Math.sqrt(num1);

    }
}
