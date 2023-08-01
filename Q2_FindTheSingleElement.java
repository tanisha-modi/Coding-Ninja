// link to the question --> https://www.codingninjas.com/studio/problems/find-the-single-element_6680465?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.*;

public class Solution {
    public static int getSingleElement(int []nums){
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                ans = e.getKey();
                break;
            }
        }
        return ans;
    }
}