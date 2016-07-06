/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4TreesAndGraphs;

/**
 *
 * @author alex
 */
public class CheckBalanced {
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.insertInOrder(4);
        root.insertInOrder(3);
        root.insertInOrder(2);
        //output will always be true since its adding elements by order
        System.out.println(isBalanced(root));
        System.out.println(isBalanced2(root));
    }

    //N log N
    public static boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }
        
        int heightdiff = getHeight(root.left) - getHeight(root.right);
        if(Math.abs(heightdiff) > 1){
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    
    public static int getHeight(TreeNode root){
        if(root == null){
            return 0;
        } 
        return Math.max(getHeight(root.left), getHeight(root.right));
    }
    
    //Version 2.0 
    public static int checkHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int leftH = checkHeight(root.left);
        if(leftH == -1){
            return -1;
        }
        
        int rightH = checkHeight(root.right);
        if(rightH == -1){
            return -1;
        }
        
        int heightDif = leftH - rightH;
        if(Math.abs(heightDif) > 1){
            return -1;
        } else {
            return Math.max(leftH, rightH) + 1;
        }
    }
    
    public static boolean isBalanced2(TreeNode root){
        if(checkHeight(root) == -1){
            return false;
        } else {
            return true;
        }
    }
    
    
}
