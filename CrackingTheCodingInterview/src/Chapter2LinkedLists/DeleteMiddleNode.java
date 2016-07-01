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
public class DeleteMiddleNode {
    
    public static void main(String[] args){
        LinkedListNode head = new LinkedListNode(0);
        head.addElement(1);
        head.addElement(2);
        head.addElement(3);
        head.addElement(4);
        head.printLinkedListNode();
        deleteNode(head.next.next);
        head.printLinkedListNode();
    }
    
    //tried a different approach, i though your input was the head of the linked list and the node to be deleted.
    public static boolean deleteNode(LinkedListNode n){
        if(n == null || n.next == null){
            return false;
        }
        LinkedListNode current = n.next;
        n.data = current.data;
        n.next = current.next;
        return true;
    }
        

    
}
