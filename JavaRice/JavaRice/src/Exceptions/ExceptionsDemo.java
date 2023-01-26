package Exceptions;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

public class ExceptionsDemo {
    public static void except() {
        /*
        Initial trial of Exception -- Do not delete
         */
//        try {
//            var reader = new FileReader("file.txt");
//            System.out.println("File Opened");
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }

        FileReader reader = null;
        try {
//            reader = new FileReader("");
//            var value = reader.read();
            //new SimpleDateFormat().parse("");

        } catch (InputMismatchException | NullPointerException e) {
            JOptionPane.showMessageDialog(null,
                    "Input Data", "Prompt",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e.getMessage());
        }
////        catch (FileNotFoundException e) {
////            JOptionPane.showMessageDialog(null,
////                    "Input Correct Data", "Prompt",
////                    JOptionPane.INFORMATION_MESSAGE);
//        }
//        finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException | InputMismatchException e) {
//                        throw new RuntimeException();
//                }
//            }
//        }

//    public static void sayHello(String name) {
//        System.out.println(name.toUpperCase());
//    }
//    public static void sayGreetings(String greeting) {
//        System.out.println(greeting.toLowerCase());
//    }

//        JOptionPane.showMessageDialog(null,
//                "I love hehe!", "haksdog",
//                JOptionPane.INFORMATION_MESSAGE);

//        var account = new Account();
//        try {
//            account.withdraw(10);
//        } catch (AccountException | InsufficientFundsException e) {
//            System.out.println(e.getMessage());
//
//        }
//    }

//    public static void showExceptionDialog(java.awt.Component parent,
//                                           java.lang.Throwable e) {
//
//    }

    }
}
