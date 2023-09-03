// link to the question --> https://www.codingninjas.com/studio/problems/longest-common-prefix_628874?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


import java.util.*;
public class Solution {
    public static String commonPrefix(String []strs,int n){
        //Write your code here
        Arrays.sort(strs);
        
        int i;
        for( i = 0; i < strs[0].length(); i++){
 
            if(strs[0].charAt(i) != strs[strs.length -1].charAt(i)){

                break;
            }
            
            
        }
        if(i == 0){
            return "-1";
        }
        return strs[0].substring(0, i);
    }
}