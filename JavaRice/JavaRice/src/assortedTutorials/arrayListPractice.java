package assortedTutorials;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();;
        food.add("Mozarella");
        food.add("Cheeseburger");
        food.add("Kamote");
        food.set(1, "Hotdog");
        food.remove(0);

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }



    }
}
