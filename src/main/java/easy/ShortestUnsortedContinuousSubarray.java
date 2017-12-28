package easy;

/**
 * Created by watson on 2017/11/29.
 */
public class ShortestUnsortedContinuousSubarray {
  public static int findUnsortedSubarray(int[] nums) {
    int min, max;
    int minIndex = 0, maxIndex = nums.length - 1;
    min = nums[0];
    max = nums[nums.length - 1];
    int dupNums = 1;
    for(int i = 0;i < nums.length;i++) {
      if(nums[i] < min) {
        minIndex = i - dupNums;
        break;
      }
      if (nums[i] == min){
        dupNums++;
      }else {
        dupNums = 0;
      }
      if (i == nums.length - 1) {
        return 0;
      }
      min = nums[i];
    }
    for(int i = nums.length - 1;i >= 0;i--) {
      if(nums[i] > max) {
        maxIndex = i + dupNums;
        break;
      }
      if (nums[i] == min) {
        dupNums++;
      }else {
        dupNums = 0;
      }
      max = nums[i];
    }
    return maxIndex - minIndex + 1;
  }
  public static int findUnsortedSubarrayTwo(int[] nums) {
    int n = nums.length;
    int maxNum = nums[0], minNum = nums[n - 1];
    int end = -2, start = -1; // in case the array is already sorted

    for (int i = 1; i < n; i++) {
      maxNum = Math.max(maxNum, nums[i]);
      if (maxNum > nums[i]) end = i;

      minNum = Math.min(minNum, nums[n - 1 - i]);
      if (minNum < nums[n - 1 - i]) start = n - 1 - i;
    }
    return end - start + 1;
  }

  public static void main(String[] args) {
    int[] nums = {1,3,2,2,2};
    int[] nums1 = {2,1};
    int[] nums2 = {1,2,3,4};
    int[] nums3 = {2,1};
    int unsortedSubarray = ShortestUnsortedContinuousSubarray.findUnsortedSubarrayTwo(nums);
    System.out.println(unsortedSubarray);
  }
}
