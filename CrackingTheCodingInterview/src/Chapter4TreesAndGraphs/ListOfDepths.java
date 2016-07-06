/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4TreesAndGraphs;

import java.util.*;

/**
 *
 * @author alex
 */
public class ListOfDepths {
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.insertInOrder(4);
        root.insertInOrder(3);
        root.insertInOrder(2);
        root.insertInOrder(1);
        root.insertInOrder(0);
        ArrayList<LinkedList<TreeNode>> res = createLevelLinkedList(root);
        
        //Couldnt think a way to print the arraylist, this is what i get at the most
        System.out.println(res.get(0).get(0).data);
        for(int i = 1; i < 4;i++){
            if(i == 3){
                System.out.println(res.get(i).get(0).data);
            } else {
                for(int j = 0; j <= 1; j++){
                    System.out.println(res.get(i).get(j).data);
                }
            }
        }
            

        
    }
 
    
    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
        /* "Visit the Root" */
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        if(root != null){
            current.add(root);
            
        }
        while(current.size() > 0){
            //Add previous level to result
            result.add(current);
            LinkedList<TreeNode> parents = current;
            current = new LinkedList<TreeNode>();
            for(TreeNode parent : parents){
                //visit left and right
                if(parent.left != null){
                    current.add(parent.left);
                }
                if(parent.right != null){
                    current.add(parent.right);
                }
            }
        }
        return result;
    }
}
