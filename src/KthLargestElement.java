import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class KthLargestElement {
    public static void main(String[] args) {
       int[]  nums = {3,2,1,5,6,4};
       int k = 2;
       int res=findKthLargest(nums, k);
        System.out.println(res);
    }

    private static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
//        HashSet<Integer> map=new HashSet<>();
//        for (int arr:nums){
//            map.add(arr);
//        }

       return nums.length-k;


    }
}
