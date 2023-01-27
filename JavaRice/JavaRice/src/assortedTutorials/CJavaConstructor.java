package assortedTutorials;

import java.util.Scanner;

public class CJavaConstructor {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//
//        while (name.isBlank()) {
//            System.out.print("Please enter your name: ");
//            name = scanner.nextLine();
//        }
//        System.out.print("Hello " + name + "!");

        int i = 0;
        for(i=0;i< 10;i++)
            System.out.println(i);

        if (i == 9) {
            System.out.println("betlog");
        } else System.out.println("kalamanuski");


    }
    public int[] twoSum(int[] nums, int target) {

        int max = nums.length;

        for(int i = 0;i<max;i++)
        {
            int diff = target - nums[i];
            for(int j=i+1;j<max;j++)
            {
                if(nums[j] == diff)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

}



