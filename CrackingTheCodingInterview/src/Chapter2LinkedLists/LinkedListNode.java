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
public class LinkedListNode {
    public LinkedListNode next, prev, last, head;
    public int data;
    public int listCount;
    
    public LinkedListNode(){ }
    
    public LinkedListNode(int d){
        head = this;
        data = d;
        listCount = 0 ;
    }
    
    public LinkedListNode(int d, LinkedListNode n, LinkedListNode p){
        data = d;
        setNext(n);
        setPrev(p);
    }
    
    public void setNext(LinkedListNode n){
        next = n;
        if(this == last){
            last = n;
        }
        if(n != null && n.prev != this){
            n.setPrev(this);
        }
    }
    
    public void setPrev(LinkedListNode p){
        prev = p;
        if(p != null && p.next != this){
            p.setNext(this);
        }
    }
    
    public LinkedListNode clone(){
        LinkedListNode next2 = null;
        if(next != null) {
            next2 = next.clone();
        }
        LinkedListNode head2 = new LinkedListNode(data, next2, null);
        return head2;
    }
    
    public void printLikedListNode(){
        LinkedListNode current = head;
        while(current.next != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println(current.data);
    }
    
    public boolean addElement(int d){
        LinkedListNode end = new LinkedListNode(d);
        LinkedListNode current = this;
        while(current.next != null){
            current = current.next;
        }
        current.next = end;
        listCount++;
        return true;
    }
    
    public boolean addElementAt(int d, int index){
        LinkedListNode end = new LinkedListNode(d);
        LinkedListNode current = this;
        int jump;
        if(index > listCount || index < 1 ){
            System.out.println("Failled to Add");
        }else {
            jump = 0;
            while(jump < index - 1){
                current = current.next;
                jump++;
            }
            end.next = current.next;
            current.next = end;
            listCount++;
            System.out.println("Successfully added");
            return true;
        }
        return true;
    }
}
