package easy;

import java.util.Arrays;

/**
 * Created by watson on 2017/11/17.
 * NUM:628
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 * 思路：
 * 排序之后找到最大的三个数乘积和两个最小数乘积与最大数乘积比较。
 *
 */
public class MaximumProductOfThreeNumbers {
  public static int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int a = nums[nums.length - 2] * nums[nums.length - 1] * nums[nums.length - 3];
    int b = nums[0] * nums[1] * nums[nums.length - 1];
    return a > b? a:b;
  }
}
