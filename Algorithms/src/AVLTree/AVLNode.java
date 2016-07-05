/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVLTree;

/**
 *
 * @author alex
 */

//All nodes must be mutually comparable to order elements
class AVLNode
 {    
     AVLNode left, right;
     int data;
     int height;
 
     /* Constructor */
     public AVLNode()
     {
         left = null;
         right = null;
         data = 0;
         height = 0;
     }
     /* Constructor */
     public AVLNode(int n)
     {
         left = null;
         right = null;
         data = n;
         height = 0;
     }     
 }
