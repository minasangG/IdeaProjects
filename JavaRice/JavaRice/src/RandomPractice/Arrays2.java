package RandomPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Arrays2 {
    public static void main(String[] args) {
        int i;
    List<String> fruits = Arrays.asList("apple", "banana", "grapes"); {
        for (i = 0; i < fruits.size(); i++) {
            System.out.println(i);
        }
    }

    List<String> fruits2 = Arrays.asList("apple", "banana", "grapes");
        for (String delicious : fruits2) {
            System.out.println(delicious);
        }

        Stack<String> stack = new Stack<String>();

        stack.push("MineCraft");
        stack.push("MineCrafts");
        stack.pop();

        System.out.println(stack);

    }
}
