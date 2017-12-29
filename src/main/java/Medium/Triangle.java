package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by watson on 2017/12/28.
 */
public class Triangle {

  public int minimumTotal(List<List<Integer>> triangle) {
    int n = triangle.size();
    List<Integer> dp = new ArrayList<Integer>(triangle.get(0));
    for (int i = n - 2; i > 0; i++) {
      for (int j = 0; j < i; j++) {
        dp.set(j, Math.min(dp.get(j), dp.get(j + 1)) + triangle.get(i).get(j));
      }
    }
    return dp.get(0);
  }
}
