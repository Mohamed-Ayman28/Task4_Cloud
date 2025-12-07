import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /,p,s): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        Operations operation = null;

        switch (op) {
            case '+':
                operation = new Addition();
                break;
            case '-':
                operation = new Subtraction();
                break;
            case '*':
                operation = new Multiplication();
                break;
            case '/':
                operation = new Division();
                break;
             case 'p':
                 operation = new Power();
                 break;
             case 's':
                operation = new SquareRoot();
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println(operation.operate(num1, num2));
    }
    }
