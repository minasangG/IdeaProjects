import java.util.Scanner;

package Exe;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        final int a1 = scanner.nextInt();
        final int b1 = scanner.nextInt();
        final int h1 = scanner.nextInt();

        boolean normal = h1 >= a1 && h1 <= b1;

        if (normal) {
            System.out.println("Normal");
        } else if (h1 < a1) {
            System.out.println("Deficiency");
        } else if (h1 > b1) {
            System.out.println("Excess");
        }
    }
}
