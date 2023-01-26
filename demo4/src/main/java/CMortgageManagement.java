import java.util.Scanner;

public class CMortgageManagement {

        public static void main(String[] args) {
            // Principal:
            // Annual Interest Rate:
            // Period (Years):
            // Mortgage:

            Scanner scanner = new Scanner(System.in);

            int principal = scanner.nextInt();
            double annualInterestRate = scanner.nextDouble();
            double periodInYears = scanner.nextDouble();
            int mortgage = scanner.nextInt();

            // Mortgage Formula M = P ((1+r)^n / (1+r))

            System.out.println(principal);
            System.out.println(annualInterestRate);
            System.out.println(periodInYears);
            System.out.println(mortgage);


        }
    }

