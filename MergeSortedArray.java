import java.util.Arrays;

public class MergeSortedArray {

    class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        
        // int idx1 = m - 1;
        // int idx2 = n-1;
        // int mid = m + n -1;
        // //int x = 0;

        // while (idx2 >= 0) {
        //     if (idx1 >= 0 && nums1[idx1] > nums2[idx2]) {
        //         nums1[mid] = nums1[idx1];
        //         mid--;
        //         idx1--;
        //     } else {
        //         nums1[mid] = nums2[idx2];
        //         mid--;
        //         idx2--;
        //     }
        // }



        // second logic

        // int i = m-1;
        // int j = n-1;
        // int k = m + n -1;

        int i = m;
        int j= 0;


        // for(j; j<n; j++){
        //     nums1[i] = nums2[j];
        //     i++;
        // }
        
        Arrays.sort(nums1);
    }
}
    public static void main(String[] args) {
        
    }
}
