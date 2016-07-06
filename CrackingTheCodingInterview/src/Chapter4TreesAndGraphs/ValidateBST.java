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
public class ValidateBST {
    
    public static boolean checkBST(TreeNode root){
        return checkBST(root, null, null);
    }
    
    private static boolean checkBST(TreeNode n, Integer min, Integer max){
        if(n == null){
            return true;
        }
        
        if((min !=null && n.data <= min) || (max != null && n.data > max)){
            return false;
        }
        
        if(!checkBST(n.left, min, n.data) || !checkBST(n.right, n.data, max)){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args){
       TreeNode root = new TreeNode(20);
       TreeNode n30 = new TreeNode(30);
       TreeNode n10 = new TreeNode(10);
       TreeNode n15 = new TreeNode(15);
       TreeNode n17 = new TreeNode(17);
       TreeNode n5 = new TreeNode(5);
       TreeNode n7 = new TreeNode(7);
       TreeNode n3 = new TreeNode(3);
       root.right = n30;
       root.left = n10;
       n10.right = n15;
       n15.right = n17;
       n10.left = n5;
       n5.right = n7;
       n5.left = n3;
       
       System.out.println(checkBST(root));
       
       
    }
    
}
