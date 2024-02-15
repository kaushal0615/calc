package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//
////        SpringApplication.run(DemoApplication.class, args);
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Scientific Calculator Menu:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Square root (√x)");
        System.out.println("6. Factorial (x!)");
        System.out.println("7. Natural logarithm (ln(x))");
        System.out.println("8. Power (x^b)");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter first number: ");
                double addNum1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double addNum2 = scanner.nextDouble();
                System.out.println("Result: " + add(addNum1, addNum2));
                break;
            case 2:
                System.out.print("Enter first number: ");
                double subNum1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double subNum2 = scanner.nextDouble();
                System.out.println("Result: " + subtract(subNum1, subNum2));
                break;
            case 3:
                System.out.print("Enter first number: ");
                double mulNum1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double mulNum2 = scanner.nextDouble();
                System.out.println("Result: " + multiply(mulNum1, mulNum2));
                break;
            case 4:
                System.out.print("Enter dividend: ");
                double divNum1 = scanner.nextDouble();
                System.out.print("Enter divisor: ");
                double divNum2 = scanner.nextDouble();
                System.out.println("Result: " + divide(divNum1, divNum2));
                break;
            case 5:
                System.out.print("Enter a number: ");
                double sqrtInput = scanner.nextDouble();
                System.out.println("Square root: " + squareRoot(sqrtInput));
                break;
            case 6:
                System.out.print("Enter a number: ");
                int factorialInput = scanner.nextInt();
                System.out.println("Factorial: " + factorial(factorialInput));
                break;
            case 7:
                System.out.print("Enter a number: ");
                double logInput = scanner.nextDouble();
                System.out.println("Natural logarithm: " + naturalLog(logInput));
                break;
            case 8:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exponent = scanner.nextDouble();
                System.out.println("Power: " + power(base, exponent));
                break;
            case 9:
                System.out.println("Exiting calculator...");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }

    static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    static double naturalLog(double x) {
        return Math.log(x);
    }

    static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }


}
