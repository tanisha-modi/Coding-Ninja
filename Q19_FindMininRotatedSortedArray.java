// link to the question --> https://www.codingninjas.com/studio/problems/rotated-array_1093219?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution {
    public static int findMin(int []nums) {
        // Write your code here.
         int start = 0;
        int end =nums.length -1;
        int mid;

        while(start <= end){
            mid = start + (end - start)/2;
            
            if(mid < end && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            else if(mid > start && nums[mid] < nums[mid -1]){
                return nums[mid];
            }
            else if(nums[mid] < nums[start]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return nums[0];
    }
}