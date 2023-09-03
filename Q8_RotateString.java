// link to the question --> https://www.codingninjas.com/studio/problems/check-if-one-string-is-a-rotation-of-another-string_1115683?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution {
    public static int isCyclicRotation(String s, String goal)  {
        String str = s + s;
            if(str.contains(goal))
            return 1;
        return 0;    
    }
}