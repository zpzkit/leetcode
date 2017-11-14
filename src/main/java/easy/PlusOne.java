package easy;

/**
 * Created by watson on 2017/11/14.
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
