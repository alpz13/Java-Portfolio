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
public class ReturnKthtoLast {
    
    public static void main(String[] args){
        LinkedListNode head = new LinkedListNode(0);
        head.addElement(1);
        head.addElement(2);
        head.addElement(3);
        head.addElement(4);
        head.printLinkedListNode();
        LinkedListNode NthElement = findKthtoLast(head,2);
        NthElement.printLinkedListNode();
    }
    
    public static LinkedListNode findKthtoLast(LinkedListNode head, int size){
        LinkedListNode current = head;
        while(size > 0 && current != null ){
            current = current.next;
            size--;
        }
        return current;
    }
    
}
