package Exceptions;

import javax.swing.*;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        ReadNumber.numberReader(
                "How much will you deposit? ",
                500, 5000);
        ExceptionsDemo.except();
    }
}
