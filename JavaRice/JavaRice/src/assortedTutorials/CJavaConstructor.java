package assortedTutorials;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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

//        int i = 0;
//        for(i=0;i< 10;i++)
//            System.out.println(i);
//
//        if (i == 9) {
//            System.out.println("betlog");
//        } else System.out.println("kalamanuski");


    }

    public int[] twoSum(int[] nums, int target) {

        int max = nums.length;

        for (int i = 0; i < max; i++) {
            int diff = target - nums[i];
            for (int j = i + 1; j < max; j++) {
                if (nums[j] == diff) return new int[]{i, j};

            }
        }
        return new int[]{0, 0};
    }

    class TwoSum {

        // Time complexity: O(n*log(n))
        private static int[] findTwoSum_Sorting(int[] nums, int target) {
            Arrays.sort(nums);
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    return new int[]{nums[left], nums[right]};
                } else if (nums[left] + nums[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
            return new int[]{};
        }

        class TwoSums {

            // Time complexity: O(n)
            private static int[] findTwoSum(int[] nums, int target) {
                Map<Integer, Integer> numMap = new HashMap<>();
                for (int i = 0; i < nums.length; i++) {
                    int complement = target - nums[i];
                    if (numMap.containsKey(complement)) {
                        return new int[]{numMap.get(complement), i};
                    } else {
                        numMap.put(nums[i], i);
                    }
                }
                return new int[]{};
            }

        }
    }
}



