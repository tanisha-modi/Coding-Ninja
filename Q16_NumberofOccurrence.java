// link to the question --> https://www.codingninjas.com/studio/problems/occurrence-of-x-in-a-sorted-array_630456?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.*;
public class Solution {
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        if(map.containsKey(x))
        return map.get(x);
        return 0;
    }
}



// optimatised using binary search ------------------------

import java.util.*;
public class Solution {
    public static int count(int arr[], int n, int k) {
        //Your code goes here
         int nums[] = {-1, -1};
        int start = 0; 
        int end = arr.length -1;
        int mid;

        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] == k){
                nums[0] = mid;
                end = mid -1;
            }
            else if(arr[mid] > k){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }

 start = 0; 
         end = arr.length -1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] == k){
                nums[1] = mid;
                start = mid +1;
            }
            else if(arr[mid] > k){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        if(nums[0] == -1 && nums[1] == -1){
            return 0;
        }
        return nums[1] - nums[0] +1;
    }
}