package SDPT;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        ArrayList<String> listOfArrays = new ArrayList<>();
        listOfArrays.add("George");
        listOfArrays.add(1, "Jerry");
        listOfArrays.add("Potanginamo");
        System.out.println(listOfArrays.get(1));

        JavaExercise javadogz = new JavaExercise();
        javadogz.firstname = "Josh";
        javadogz.lastname = "kamote";
        System.out.println(javadogz.firstname);
    }
}
