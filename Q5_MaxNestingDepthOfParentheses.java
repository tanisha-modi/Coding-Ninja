// link to the question --? https://www.codingninjas.com/studio/problems/maximum-nesting-depth-of-the-parentheses_8144741?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution {
    public static int maxDepth(String s) {
        // Write your code here.
        int count = 0;
        int max = 0;
	for(int i = 0; i < s.length(); i++){
		char ch = s.charAt(i);
		if(ch == '('){
			count++;
            if(count > max){
                max = count;
            }
		}
        else if(ch == ')'){
            count--;
        }
	}
	return max;
    }
}