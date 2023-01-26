package SDPT;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        String[] userNames = {"williamski", "cabaronski", "clarkski"};
        String[] userEmails = {"sabiksabikA73@yahoo.com", "Juskoday@yahoo.com", "youAndME@yahoo.com"};
        String[] userPasswords = {"sabiks", "mellownice", "crackwhite"};

        System.out.println(userNames[0]);
        System.out.println(userEmails[2]);
        System.out.println(userPasswords[2]);

        int[][] numbers = { {1, 2, 3}, {3, 2, 1}};
        numbers[0][0] = 1;
//        Arrays.sort(numbers);
        System.out.println(Arrays.deepToString(numbers));
    }
}


