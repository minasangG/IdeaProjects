package assortedTutorials;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();
        food.add("Cheesy Macaroni");
        food.add("Bacony Pizzaria");
        food.add("Sugary Pasta");
        food.set(1, "Lugawi Hastani");
        food.remove(1);

        System.out.println(food.get(1));




    }
}
