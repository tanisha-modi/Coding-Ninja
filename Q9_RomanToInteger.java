// link to the question --> https://www.codingninjas.com/studio/problems/roman-numeral-to-integer_981308?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution {
    public static int romanToInt(String roman) {
        // Write your code here
         int total = 0;

         for (int i = 0; i < roman.length(); i++) {    // roman.length() // this function gives  
    
            int l1 = value(roman.charAt(i));
            
            if( i+1 < roman.length()){
                int l2 = value(roman.charAt(i +1));
                if (l1 >= l2) {
                    total += l1;
                }
                else{
                    total -= l1;
                }
            }
            else{
                total += l1;
            }

         }

         return total;
     }
 static int value(char letter){
         
        if(letter == 'i' || letter == 'I') 
            return 1;
        else if (letter == 'v' || letter == 'V') 
            return 5;
        else if (letter == 'x' || letter == 'X') 
            return 10;
        else if (letter == 'l' || letter == 'L') 
            return 50;
        else if (letter == 'c' || letter == 'C') 
            return 100;
        else if (letter == 'd' || letter == 'D') 
            return 500;
        else if (letter == 'm' || letter == 'M') 
            return 1000;
        else
            return -1;
    }
}