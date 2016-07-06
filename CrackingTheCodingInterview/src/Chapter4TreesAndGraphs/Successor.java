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
public class Successor {
    
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
       System.out.println(inorderSucc(root).data);
    }
    
    public static TreeNode inorderSucc(TreeNode n){
        if( n == null){
            return null;
        }
        
        if(n.right != null){
            return leftChildNode(n.right);
        } else {
            TreeNode q = n;
            TreeNode x = q.parent;
            while(x != null && x.left != q){
                q = x;
                x = x.parent;
            }
            return x;
        }
    }
    
    public static TreeNode leftChildNode(TreeNode n){
        if(n == null){
            return null;
        }
        while(n.left != null){
            n = n.left;
        }
        return n;
    }
    
}
