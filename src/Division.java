public class Division implements Operations {

    @Override
    public  double operate(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
        }
          return num1/num2;
    }
}
