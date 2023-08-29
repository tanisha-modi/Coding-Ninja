https://www.codingninjas.com/studio/problems/reverse-words-in-a-string_696444?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution 
{
	public static String reverseString(String s) 
	{
		//Write your code here
		String[] temp = s.trim().split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=temp.length-1; i>0; i--){
            if(temp[i]==""){
                continue;
            }
            ans.append(temp[i]+" ");
        }
        ans.append(temp[0]);
        return ans.toString();
	}
}
