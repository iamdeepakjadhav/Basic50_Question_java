public class RemoveElementArray {
    public static void main(String[] args) {


        int arr[] = { 3, 5, 3, 6, 7, 3 };
        Solution s1 = new Solution();

        s1.removeElement(arr, 3);
        /*
        int n = arr.length;

        int rm = 3, tamp;

        for (int i = 0; i < n; i++) {

            if (arr[i] == rm) {

                for (int dl = i; dl < n - 1; dl++) {
                    arr[dl] = arr[dl + 1];

                }
                if (arr[i] == rm) {
                    arr[i] = 0;
                }
            }

        }

        for (int k = 0; k < n; k++) {
            if (arr[k] != -1) {
                System.out.print(arr[k] + " ");
            }
        }
        */
    }

}



class Solution {
    int null1;
    public int removeElement(int[] nums, int val) {
        
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val) {

                for(int dl = i ; dl<nums.length-1; dl++){
                    nums[dl]= nums[dl+1];   
                     
                }
                if (nums[i]==val) {
                    
                    nums[i] = null1;
                }
            }
        }
         for (int k = 0; k < nums.length; k++) {
            if (nums[k] != null1) {

                System.out.print(nums[k] + " ");
            }
        }
        return val;
        
    }

}