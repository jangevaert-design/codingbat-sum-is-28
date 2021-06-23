package edu.cnm.deepdive;

/*

Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 */

public class CodingBatSumIs28 {

  private static int[] one = {2, 3, 2, 2, 4, 2};
  private static int[] two = {2, 3, 2, 2, 4, 2, 2};
  private static int[] three = {1, 2, 3, 4};

  public static void main(String[] args) {
    System.out.println("given the array [2, 3, 2, 2, 4, 2], the outcome is " + sum28(one) + ".");
    System.out.println("given the array [2, 3, 2, 2, 4, 2, 2], the outcome is " + sum28(two) + ".");
    System.out.println("given the array [1, 2, 3, 4], the outcome is " + sum28(three) + ".");
  }

  public static boolean sum28(int[] nums) {
    int count = 0;
    int len = nums.length;

    for (int i = 0; i < len; i++) {
      if (nums[i] == 2) {
        count++;
      }
    }
    return (count == 4);
  }

}
