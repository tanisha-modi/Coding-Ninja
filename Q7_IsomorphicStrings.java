// link to the question --> https://www.codingninjas.com/studio/problems/isomorphic-strings-_1117636?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.*;
public class Solution {
    public static boolean areIsomorphic(String s, String t) {
        // Write your code here.
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int n = s.length() - 1;
        if(s.length() != t.length()){
            return false;
        }
        while (n >= 0) {
            if (map.containsKey(s.charAt(n)) && map.get(s.charAt(n)) != t.charAt(n)) {
                return false;
            }
            if (!map.containsKey(s.charAt(n)) && set.contains(t.charAt(n))) {
                return false;
            }
            set.add(t.charAt(n));
            map.put(s.charAt(n), t.charAt(n));
            n--;
        }
        
        return true;
    }
}