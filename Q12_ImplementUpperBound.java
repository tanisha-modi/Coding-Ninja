// link to the question --> https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution {
    public static int upperBound(int []nums, int target, int n){
        // Write your code here.
        int start = 0;
        int end = nums.length -1;
        int mid ;
         

        while(start <= end){

           mid = start + (end - start)/2;

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
