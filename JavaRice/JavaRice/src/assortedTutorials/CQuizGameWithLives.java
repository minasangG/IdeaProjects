package assortedTutorials;

public class CQuizGameWithLives {

    public static void main(String[] args) {

        int[] numbers =  {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("This is the total: " + sum);

    }
}
