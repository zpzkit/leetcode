package easy;

/**
 * Created by watson on 2017/11/14.
 * NUM.66
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

 You may assume the integer do not contain any leading zero, except the number 0 itself.

 The digits are stored such that the most significant digit is at the head of the list.

 */
public class PlusOne {

  public static int[] plusOne(int[] digits) {
    int len = digits.length;
    for (int i = len - 1; i >= 0; i--) {
      //如果小于9加一不需要进位，就可以结束直接返回数组
      if (digits[i] < 9){
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }
    //如果最后需要进位，那其他位都一定为0，所以new一个新的数组第一位赋值为1就ok
    int[] res = new int[len + 1];
    res[0] = 1;
    return res;
  }

}
