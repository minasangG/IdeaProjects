package assortedTutorials;

import java.util.Scanner;

public class CArrayOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesOfApplicants = {"clark@yahoo.com", "swayersdog@yahoo.com", "bts@yahoo.com"};
        String[] emailsOfApplicants = {"clark", "sway", "bangtan"};
        String[] passwordsOfApplicants = {"sabiksabik", "tarubaskibas", "pwetnisway"};

        int i = scanner.nextInt();
        System.out.println("Please enter your name: " + namesOfApplicants[i]);
        System.out.println("Please enter your password: "+ passwordsOfApplicants[i]);
        System.out.println("Please enter your email: " + emailsOfApplicants[i]);
    }

}
