// link to the question --> https://www.codingninjas.com/studio/problems/search-in-rotated-sorted-array_1082554?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.ArrayList;
public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int pivot = findPivot(arr, k);

        if(pivot == -1){
            return BS(arr, k, 0, n-1);
        }
        if(arr.get(pivot) == k){
            return pivot;
        }
        if(k >= arr.get(0)){
            return BS(arr, k, 0, pivot);
        }
        return BS(arr, k, pivot+1, n-1);
        
    }
    static int BS(ArrayList<Integer> arr, int k, int start, int end){
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr.get(mid) == k){
                return mid;
            }
            else if(k < arr.get(mid)){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    static int findPivot(ArrayList<Integer> arr, int k){
        int start = 0;
        int end = arr.size() -1;
        int mid;

        while(start <= end){
            mid = start + (end - start)/2;
            if(mid < end && arr.get(mid) > arr.get(mid +1)){
                return mid;
            }
            else if(mid > start && arr.get(mid) < arr.get(mid -1)){
                return mid -1;
            }
            else if(arr.get(mid) > arr.get(start)){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}