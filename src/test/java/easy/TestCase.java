package easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by watson on 2017/11/14.
 */
public class TestCase {

  @Test
  public void PlusOne() {
    int[] test = new int[3];
    test[0] = 9;
    test[1] = 9;
    test[2] = 9;
    int[] ints = PlusOne.plusOne(test);
    Assert.assertEquals(ints[0], 1);
    int[] test1 = new int[1];
    test1[0] = 0;
    Assert.assertEquals(ints[0], 1);
  }

}
