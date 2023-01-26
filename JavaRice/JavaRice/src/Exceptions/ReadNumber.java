package Exceptions;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumber {
    public static long numberReader(String prompt, long min, long max) {


        JOptionPane.showMessageDialog(null,
                "Hello, Happy Banking With Us!", "Prompt",
                JOptionPane.INFORMATION_MESSAGE);
        Scanner sc = new Scanner(System.in);

        long value = 0;
        while (true) {
            try {
                System.out.println(prompt);
                value = Long.parseLong(sc.nextLine());
                if (value >= min && value <= max) {
                    break;
                }
                } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(null,
                        "Input Data", "Prompt",
                        JOptionPane.WARNING_MESSAGE);
//                System.out.println("Input Data");
                System.out.println("Please enter values only " +
                        "between " + min + " and " + max);
                System.out.println();
                }


            }
            System.out.println("Deposit Accepted");
            return value;
        }



    }














//        if (amountDeposited < min) {
//            System.out.println("Please deposit an " +
//                    "amount with a minimum of 500 PHP");
//        } else {
//            System.out.println("Deposit accepted");
//            System.out.println("Here is the amount you" +
//                    "have deposited" + amountDeposited);
//        }

