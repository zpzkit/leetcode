package Medium;

/**
 * Created by watson on 2017/12/29.
 */
class Solution {
  public int findPeakElement(int[] nums) {
    for (int i = 1;i < nums.length; i++) {
      if(nums[i] < nums[i - 1]) {
        return i - 1;
      }
    }
    return nums.length - 1;
  }
}
