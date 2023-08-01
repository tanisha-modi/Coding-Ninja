// link to the question --> https://www.codingninjas.com/studio/problems/traffic_6682625?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution {
    public static int traffic(int n, int m, int []vehicle) {
        // Write your code here.
        int count = 0;
        int max = 0;
        int mm = m;
        int temp = 0;
        for(int i = 0; i<vehicle.length; i++){
            if(vehicle[i] == 1){
                count++ ;  
            }
            else if(m > 0){
                if(mm == m){
                    temp = i;
                }
                if(m > 0){
                    m--;
                }
                count++;
            }
            else{
                    if(count>max){
                    max = count;
                }
                m = mm;
                i = temp;
                count = 0;
                }
            
        }
        if(count>max){
                    max = count;
                }
        return max;
    }
}