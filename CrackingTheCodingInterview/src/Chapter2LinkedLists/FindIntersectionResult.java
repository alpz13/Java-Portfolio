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
public class FindIntersectionResult {
    
    public LinkedListNode tail;
    public int size;
    
    public FindIntersectionResult(LinkedListNode tail, int size){
        this.tail = tail;
        this.size = size;
    }
    
}
