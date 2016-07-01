/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2LinkedLists;

/**
 *
 * @author alex
 */
public class LoopDetection {
    
    public static void main(String[] args){
         
        LinkedListNode p = new LinkedListNode(0);
        p.addElement(1);
        p.addElement(2);
        p.addElement(3);
        p.addElement(4);
        p.addElement(5);
        p.printLinkedListNode();
        p.next.next.next.next = p.next.next.next;
        
        LinkedListNode z = FindLoopNode(p);
        System.out.println(z.data);
        

    }
    
    public static LinkedListNode FindLoopNode(LinkedListNode head){
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        
        //if they dont meet or collide
        if(fast == null || slow == null){
            return null;
        }
        
        /* Now we know they will collide someday at the begginning of the loop
           we move pointers until both nodes are the same.
        */
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
        
    }
}
