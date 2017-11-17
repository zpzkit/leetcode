package easy;

/**
 * Created by watson on 2017/11/17.
 *
 * NUM:414
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 *
 * 思路：
 * 1、第三大的数，就用三个数字代表前三个最大的数
 * 2、需要判断如果有与前三数相等的数，就判断这个数是否已经参与了赋值，因为如果重复参与赋值就会导致冲掉后面的数字，
 * 例如前三数是[3,2,1],现在又来一个3，就会把2向后移1被覆盖变成[3,3,2]，所以加一个计数器count，每次做赋值操作都需要对count加一，
 * 如果count>=1说明一定最大的数参与过了，因为第一次肯定是赋值最大的数，如果count>=2说明second也参与了赋值，因为前三的数初始化是最小值，
 * 所以count==2时不可能跳过第二步，count>=3同理说明也参与过赋值了。
 * 3、然后依次判断当前数是否比三个数字大，但是在比较最小的数时需要是>=，否则当给的数列中中有最小值时就会少一次判断
 * 4、如果没有第三大数需要输出最大数，所以最后加上count<3的校验
 */
public class ThirdMaximumNum {
  public static int thirdMax(int[] nums) {
    int one, two, three, count = 0;
    one = two = three = Integer.MIN_VALUE;
    for (int x : nums) {
      //若相同继续循环，要有count判断，因为nums中可能有Integer.MIN_VALUE
      if (x == one && count >= 1 || x == two && count >= 2 || x == three
          && count >= 3)
        continue;
      if (x > one) {
        three = two;
        two = one;
        one = x;
        //每次记录操作次数
        count++;
      } else if (x > two) {
        three = two;
        two = x;
        count++;
        //此处一定是有等于的，若没有有可能露掉
        //int nums[] = { 1, 2, Integer.MIN_VALUE };缺少一次判断
      } else if (x >= three) {
        three = x;
        count++;
      }
    }
    //count 代表更新的次数，若大于等于3，表示有第三大的数
    if (count >= 3)
      return three;
    else
      return one;
  }
}
