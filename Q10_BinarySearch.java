// link to the question --> https://www.codingninjas.com/studio/problems/binary-search_972?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.
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
        return -1;
    }
}