// link to the questio --> https://www.codingninjas.com/studio/problems/cycle-detection-in-a-singly-linked-list_628974

public class Solution {

    public static boolean detectCycle(Node head) {
        //Your code goes here
        if(head == null || head.next == null){
            return false;
        }

        Node fast = head; 
        Node slow = head; 

        while(fast.next != null && fast.next.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}