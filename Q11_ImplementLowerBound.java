// link to the question --> https://www.codingninjas.com/studio/problems/lower-bound_8165382?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution {
    public static int lowerBound(int []nums, int n, int target) {
        // Write your code hereint start = 0;
        int start = 0;
        int end = nums.length -1;
        int mid ;
         

        while(start <= end){

           mid = start + (end - start)/2;

           if(nums[mid] == target){
               return mid;
           }

           if(nums[mid] > target){
               end = mid -1;
           }
           else{
               start = mid +1;
           }

        }
        return start;
    }
}