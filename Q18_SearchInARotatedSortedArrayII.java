// link to the question --> https://www.codingninjas.com/studio/problems/search-in-a-rotated-sorted-array-ii_7449547?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution {
    public static boolean searchInARotatedSortedArrayII(int []nums, int target) {
        // Write your code here. int pivot = findPivotWithDuplicates(nums);
    int pivot = findPivotWithDuplicates(nums);
            if (pivot == -1) {
                return binarySearch(nums, target, 0 , nums.length - 1);
            }
            if (nums[pivot] == target) {
                return true;
            }
    
            if (target >= nums[0]) {
                return binarySearch(nums, target, 0, pivot - 1);
            }
    
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static boolean binarySearch(int[] arr, int target, int start, int end) {
            while(start <= end) {
                int mid = start + (end - start) / 2;
    
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return true;
                }
            }
            return false;
        }
        static int findPivotWithDuplicates(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                // 4 cases over here
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid-1;
                }
    
                // if elements at middle, start, end are equal then just skip the duplicates
                if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                    // skip the duplicates
                    // NOTE: what if these elements at start and end were the pivot??
                    // check if start is pivot
                    if (start < end && arr[start] > arr[start + 1]) {
                        return start;
                    }
                    start++;
    
                    // check whether end is pivot
                    if (end > start && arr[end] < arr[end - 1]) {
                        return end - 1;
                    }
                    end--;
                }
                // left side is sorted, so pivot should be in right
                else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
    }
}