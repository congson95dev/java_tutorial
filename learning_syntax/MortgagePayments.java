package learning_syntax;

import java.util.Scanner;

public class MortgagePayments {
    public static void main(String[] args) {
        // this is a small exercise which to input 3 params and calculate result based on that 3 params

        // define scanner
        Scanner scanner = new Scanner(System.in);

        double monthly_payment = 0;
        try {
            System.out.print("Principal: ");
            double p = scanner.nextDouble();

            System.out.print("Monthly interest rate: ");
            double r = scanner.nextDouble();

            System.out.print("Number of payments: ");
            double n = scanner.nextDouble();

            System.out.println("Principal: " + p);
            System.out.println("Monthly interest rate: " + r);
            System.out.println("Number of payments: " + n);

            // calculate
            monthly_payment = p * r * Math.pow((1 + r), n) / (Math.pow((1 + r), n) - 1);
        } catch (Exception e) {
            System.out.println("Wrong data input");
        }

        System.out.println("Monthly payment: " + monthly_payment);
    }
}
