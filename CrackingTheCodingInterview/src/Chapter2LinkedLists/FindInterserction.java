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
public class FindInterserction {
    
    public static void main(String[] args){
        
        LinkedListNode p = new LinkedListNode(0);
        p.addElement(1);
        p.addElement(2);
        p.addElement(3);
        p.addElement(4);
        p.printLinkedListNode();
        
        LinkedListNode q = new LinkedListNode(5);
        q.addElement(6);
        q.printLinkedListNode();
        
        
        q.head.next.next = getNthNode(p,2);
        q.printLinkedListNode();
        
        LinkedListNode z = findIntersection(p,q);
        z.printLinkedListNode();
        
       
        
    }

    public static LinkedListNode findIntersection(LinkedListNode p, LinkedListNode q){
        LinkedListNode shorter, longer;
        //if both linked list are null
        if(p == null || q == null){
            return null;
        }
        
        FindIntersectionResult res1 = getTailNSize(p);
        FindIntersectionResult res2 = getTailNSize(q);
        
        //if both links dont intersect
        if(res1.tail != res2.tail){
            return null;
        }
        
        if(res1.size < res2.size){
            shorter = p;
            longer = q;
        } else {
            shorter = q;
            longer = p;
        }
        
        //returns the node that is found by the difference of size
        longer = getNthNode(longer, Math.abs(res1.size - res2.size));
        
        //finds the node if both lists sizes are the same
        while(shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }
        
        return longer;
    }
    
    public static FindIntersectionResult getTailNSize(LinkedListNode list){
        if(list == null){
            return null;
        }
        int size = 1;
        LinkedListNode current = list;
        while(current.next != null){
            size++;
            current = current.next;
        }
        return new FindIntersectionResult(current, size);
    }
    
    public static LinkedListNode getNthNode(LinkedListNode head, int n){
        LinkedListNode current = head;
        while(n > 0 && current != null){
            current = current.next;
            n--;
        }
        return current;
    }
    
}
