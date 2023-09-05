// link to the question --> https://www.codingninjas.com/studio/problems/unique-element-in-sorted-array_1112654?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> nums)
    {
        //    Write your code here.
        int left = 0, right = nums.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums.get(mid) != nums.get(mid+1)) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums.get(left);
    }
}