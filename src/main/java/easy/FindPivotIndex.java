package easy;

/**
 * Created by watson on 2017/11/15.
 * NUM.724
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.

 We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

 If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 */

public class FindPivotIndex {
  public int pivotIndex(int[] nums) {
    int rightSum = 0, leftSum = 0;
    for(int i = 0;i < nums.length;i++) {
      rightSum += nums[i];
    }

    for (int i = 0;i < nums.length;i++) {
      if (i > 0) {
        leftSum += nums[i - 1];
      }
      rightSum -= nums[i];
      if(leftSum == rightSum) {
        return i;
      }
    }
    return -1;
  }
}
