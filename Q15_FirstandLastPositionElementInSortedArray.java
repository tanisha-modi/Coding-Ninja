// link to the question --> https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int nums[] = {-1, -1};
        int start = 0; 
        int end = arr.size() -1;
        int mid;

        while(start <= end){
            mid = start + (end - start)/2;
            if(arr.get(mid) == k){
                nums[0] = mid;
                end = mid -1;
            }
            else if(arr.get(mid) > k){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }

 start = 0; 
         end = arr.size() -1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr.get(mid) == k){
                nums[1] = mid;
                start = mid +1;
            }
            else if(arr.get(mid) > k){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return nums;
    }

};
