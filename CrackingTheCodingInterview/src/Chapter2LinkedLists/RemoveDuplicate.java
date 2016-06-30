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
public class RemoveDuplicate {
    public static void main(String[] args){
        LinkedListNode head = new LinkedListNode(0);
        head.printLikedListNode();
        head.addElement(1);
        head.printLikedListNode();
        head.addElement(2);
        head.printLikedListNode();
        head.addElement(2);
        head.addElement(2);
        head.printLikedListNode();
        deleteDup(head);
        head.printLikedListNode();
        
    }
    
    public static void deleteDup(LinkedListNode head){
        LinkedListNode current = head;
        while(current != null){
            LinkedListNode runner = current;
            while(runner.next != null){
                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            } 
            current = current.next;
        }
    }
    
}
