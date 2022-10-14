package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TestCalculator.displayMenu();


        System.out.println("Enter Operation Type (+ , -, * or /)");
        char OperationType = scanner.next().charAt(0);

        while (true) {
            System.out.println("Enter Number 1: ");
            double n1 = scanner.nextInt();
            System.out.println("Enter Number 2: ");
            double n2 = scanner.nextInt();
            switch (OperationType) {
                case '+':
                    double result = TestCalculator.addition(n1, n2);
                    System.out.println(result);
                    break;
                case '-':
                    System.out.println(TestCalculator.subtraction(n1, n2));
                    break;
                case '*':
                    System.out.println(TestCalculator.multiplication(n1, n2));
                    break;
                case '/':
                    System.out.println(TestCalculator.divison(n1, n2));
                    break;
                default:
                    System.out.println("You entered incorrect input");
            }
            System.out.println("Do you want to continue? yes or no?");
            String continueOperation = scanner.next();
            if (continueOperation.equalsIgnoreCase("no")) {
                break;

            }
        }
    }
}