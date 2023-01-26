package Kunal_Kushwaha;

import com.sun.security.jgss.GSSUtil;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IdeaProject {
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896, -6};
        int counter = 0;

        for (int i : nums) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        // Arrays Practice
//        System.out.println(nums.length);
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(counter);
        // Formatting Practice
//        String percent = NumberFormat.getPercentInstance().format(.1);
//        System.out.println(percent);

//        int[] numbers = {1, 2, 3, 4, 5};
//        int[][] numbers2 = {};
        //IF statement practice

//        System.out.print("What is the temperature there in Celsius? ");
//        int temperature = scan.nextInt();
//
//        if (temperature >= 30) {
//            System.out.println("It is very hot out there, get inside!");
//        } else {
//            System.out.println("It is very cold, get a jacket!");
//        }
//    }
//        long income = scan.nextLong();
//        boolean hasHighIncome = (income > 100_000);
//        if (hasHighIncome == true) {
//            System.out.println("You have high income than average");
//        } else {
//            System.out.println("You have lower income than average, dapat happy ka kasi may work ka");
//        }
//        System.out.print("What is your role in the company: ");
//        String role = scan.nextLine();
//
//        switch (role) {
//            case "1":
//                System.out.println("You are an admin");
//                break;
//            case "2":
//                System.out.println("You are a moderator");
//                break;
//            default:
//                System.out.println("You are a guest");
//                break;


        }
}

