// link to the question --> https://www.codingninjas.com/studio/problems/find-peak-element_1081482?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.ArrayList;
public class Solution {
    public static int findPeakElement(ArrayList<Integer> nums) {
        // Write your code here.
        int start = 1; 
        int end = nums.size() -2;
        int mid;


        if(nums.size() == 1){
            return 0;
        }
        if(nums.get(0) > nums.get(1)){
            return 0;
        }
        if(nums.get(nums.size() -2) < nums.get(nums.size() -1)){
            return nums.size() -1;
        }

        while(start <= end){
            mid = start + (end - start)/2;
            if(nums.get(mid) > nums.get(mid-1) && nums.get(mid) > nums.get(mid+1)){
                return mid;
            }
            else if(nums.get(mid) > nums.get(mid-1)){
                start = start +1;
            }
            else{
                end = end -1;
            }
        }
        return nums.get(0);
    }
};
