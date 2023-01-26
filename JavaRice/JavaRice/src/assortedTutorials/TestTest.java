package assortedTutorials;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
            int n = ((number + 1) * number  + 2) * number + 3;
            System.out.print(n);

        long lo = Integer.MAX_VALUE; // (1)
        int i = (int)lo; // (2)
        char ch = (char)i; // (3)
        double d = ch; // (4)
        float f = (float)d; // (5)
    }

    public static class Main {

            public static void main(String[] args) {
                inputToDecrement();
            }

            static void inputToDecrement() {
                Scanner scanner = new Scanner(System.in);
                List<Integer> list = new ArrayList<>();
                List<Integer> decrementedList = new ArrayList<>();
                String str = scanner.nextLine();
                String[] strings = str.split(" ");
                Integer numb = 0;
                for (String str1 : strings) {
                    list.add(Integer.parseInt(str1));
                }
                for (Integer number : list) {
                    numb = number;
                    decrementedList.add(--numb);
                }
                for (int x : decrementedList) {
                    System.out.print(x + " ");
                }
            }
        }
}
