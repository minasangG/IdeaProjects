package SwayCalc;
import java.util.Scanner;

public class ReadNumber {
    static Scanner sc = new Scanner(System.in);
    public static double readNumber(String prompt, int min, int max) {

        double value;
        while (true) {
            System.out.print(prompt);
            value = sc.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Please only enter value between " + min + " and " + max + ".");
        }
        return value;

        }
    }

