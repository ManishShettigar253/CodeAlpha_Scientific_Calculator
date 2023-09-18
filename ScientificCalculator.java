import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        int n,r;

        while (true) {
            System.out.println("\n*** SCIENTIFIC CALCI ***");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Square Root");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Permutation");
            System.out.println("11. Combination");
            System.out.println("12. Exit");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");

            short choice = scanner.nextShort();

            if (choice == 12) {
                System.out.println("Exiting the calculator.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    result = num1 + num2;
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    break;

                case 4:
                    System.out.print("Enter numerator: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter denominator: ");
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                        continue;
                    }
                    result = num1 / num2;
                    break;

                case 5:
                    System.out.print("Enter Base : ");
                    n = scanner.nextInt();
                    System.out.print("Enter Exponent : ");
                    r = scanner.nextInt();
                    result=1;
                    for(int i=1;i<=r;i++)
                        result *= n;
                    break;    

                case 6:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    result = Math.sqrt(num1);
                    break;

                case 7:
                    System.out.print("Enter an angle in degrees: ");
                    double angle = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(angle));
                    break;

                case 8:
                    System.out.print("Enter an angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(angle));
                    break;

                case 9:
                    System.out.print("Enter an angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.tan(Math.toRadians(angle));
                    break;

                case 10:
                    System.out.print("Enter 'n' value : ");
                    n = scanner.nextInt();
                    System.out.print("Enter 'r' value : ");
                    r = scanner.nextInt();
                    result = fact(n)/fact(n-r);
                    break;

                case 11:
                    System.out.print("Enter 'n' value : ");
                    n = scanner.nextInt();
                    System.out.print("Enter 'r' value : ");
                    r = scanner.nextInt();
                    result = fact(n)/(fact(n-r) * fact(r));
                    break;

                default:
                    System.out.println("Invalid choice!!!");
                    break;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
    public static int fact(int n)
    {
        int fact =1;
        for(int i=1;i<=n;i++)
            fact *= i;
        return fact;
    }
}
