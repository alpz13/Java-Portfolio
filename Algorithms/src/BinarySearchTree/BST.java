/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

import java.util.*;

/**
 *
 * @author alex
 */
public class BST {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("Binary Search Tree Test");
        char ch;
        do{
            Menu();
            int choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter number to insert");
                    bst.insert(in.nextInt());
                    break;
                case 2:
                    System.out.println("Enter number to delete");
                    bst.delete(in.nextInt());
                    break;
                case 3:
                    System.out.println("Enter number to search");
                    System.out.println("Search result : " + bst.search(in.nextInt()));
                    break;
                case 4:
                    System.out.println("Nodes = "+ bst.countNodes());
                    break;
                case 5:
                    System.out.println("Empty status = "+ bst.isEmpty());
                    break;
                default :
                    System.out.println("Wrong Entry \n");
                    break;
            }
            
            //Display tree
            System.out.print("\nPost order : ");
            bst.postorder();
            System.out.print("\nPre order : ");
            bst.preorder();
            System.out.print("\nIn order : ");
            bst.inorder();
            
            System.out.println("\nDo you want to continue? (Y/N)");
            ch = in.next().charAt(0);
        } while(ch == 'Y' || ch == 'y');
    }
    
    public static void Menu(){
        System.out.println("Binary Search Tree Operations\n");
        System.out.println("1. insert");
        System.out.println("2. delete");
        System.out.println("3. search");
        System.out.println("4. count nodes");
        System.out.println("5. check empty");
    }
    
}
