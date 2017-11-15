package easy;

/**
 * Created by watson on 2017/11/9.
 * NUM.88
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

 Note:
 You may assume that nums1 has enough space (size that is greater or equal to m + n)
 to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class MergeSortedArray{

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int pos_m = 0, pos_n = 0, pos;
    int[] tmp = new int[m];
    for(int i = 0;i < m;i++) {
      tmp[i] = nums1[i];
    }
    for(pos = 0;pos < m + n;pos++) {
      if(pos_m < m && pos_n < n) {
        if(tmp[pos_m] >= nums2[pos_n]) {
          nums1[pos] = nums2[pos_n];
          pos_n++;
        }else {
          nums1[pos] = tmp[pos_m];
          pos_m++;
        }
      }else {
        if(pos_m < m) {
          nums1[pos] = tmp[pos_m];
          pos_m++;
        }else if(pos_n < n) {
          nums1[pos] = nums2[pos_n];
          pos_n++;
        }
      }
    }
  }
}
