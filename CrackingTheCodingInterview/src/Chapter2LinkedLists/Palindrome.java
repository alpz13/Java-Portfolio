/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2LinkedLists;

import java.util.*;

/**
 *
 * @author alex
 */
public class Palindrome {
    
    public static void main(String[] args){
        LinkedListNode head = new LinkedListNode(0);
        head.addElement(1);
        head.addElement(2);
        head.addElement(3);
        head.addElement(4);
        head.addElement(5);
        head.addElement(4);
        head.addElement(3);
        head.addElement(2);
        head.addElement(1);
        head.addElement(0);
        head.printLinkedListNode();
        System.out.println(isPalindrome(head));
        
    }
    
    
    
    public static boolean isPalindrome(LinkedListNode head){
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        
        Stack<Integer> stack = new Stack<>();
        
        /*this was kind of curious, i found this at Oracle's interview
          in the case of palindrome you only check half in this case half of the input
          goes to the stack. Oracle was a paragraph as the input.
          we have a fast pointer that travels twice the slow pointer.
        */
        while(fast != null && fast.next != null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //list have odd number of element so we can skip middle one
        if(fast != null){
            slow = slow.next;
        }
        
        //compare the second half of the linkedlist with stack whose size is input/2 
        while(slow != null){
            int top = stack.pop().intValue();
            if(top != slow.data){
                return false;
            }
            slow = slow.next;
        }
        return true;  
    }
    
        
    
    
}
