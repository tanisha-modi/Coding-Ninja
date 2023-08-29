// link to the question --> https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.*;

public class Solution {
    public static int longestSubarrayWithSumK(int []nums, long k) {
        // Write your code here
        // int count = 0;
        // long sum = 0;
        // int
        // for(int i= 0; i < a.length; i++){
        //     for(int j =i; j < a.length; j++){
        //         for (int l = i; l <= j; l++) {
                    
        //         sum += (long)a[l];
        //         }
        //     if(sum == k){
        //         if(max > j-i){
        //             max = j-i;
        
        //     }
        //     }
        //     sum = 0;
        //     }
        // }
        // return max;

        int max = Integer.MIN_VALUE;
        int[] currSum = new int[nums.length + 1];
        currSum[0] = 0;
        for(int i = 1; i <= nums.length; i++){
            currSum[i] = nums[i-1] + currSum[i-1];
        }
        for(int i = 0; i < currSum.length; i++){
             int sum = 0;
             for(int j = 0; j < i; j++){
                 sum = currSum[i] - currSum[j];
                 if(sum == k){
                if(max < i-j){
                    max = i-j;
        
            }
             }
        }}
        return max;



        
        // int n = a.length; 
        // // size of the array.

        // Map<Integer, Integer> preSumMap = new HashMap<>();
        // int sum = 0;
        // int maxLen = 0;
        // for (int i = 0; i < n; i++) {
        //     //calculate the prefix sum till index i:
        //     sum += a[i];

        //     // if the sum = k, update the maxLen:
        //     if (sum == k) {
        //         maxLen = Math.max(maxLen, i + 1);
        //     }

        //     // calculate the sum of remaining part i.e. x-k:
        //     int rem = sum - (int)k;

        //     //Calculate the length and update maxLen:
        //     if (preSumMap.containsKey(rem)) {
        //         int len = i - preSumMap.get(rem);
        //         maxLen = Math.max(maxLen, len);
        //     }

        //     //Finally, update the map checking the conditions:
        //     if (!preSumMap.containsKey(sum)) {
        //         preSumMap.put(sum, i);
        //     }
        // }

        // return maxLen;
    }
}