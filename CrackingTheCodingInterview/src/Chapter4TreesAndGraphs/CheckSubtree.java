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
public class CheckSubtree {
    
    public static boolean containsTree(TreeNode t1, TreeNode t2){
        if(t2 == null){
            /*since there is no tree to compare i guess is false
              but i've been reading that this might be wrong
            */
            return false; 
        }
        return subTree(t1, t2);
    }
    
    public static boolean subTree(TreeNode r1, TreeNode r2){
        if(r1 == null){
            /*Same as past comment
            */
            return false;
        } else if(r1.data == r2.data && matchTree(r1,r2)){
            return true;
        }
        return (subTree(r1.left, r2) || subTree(r1.right, r2));    
    }
    
    public static boolean matchTree(TreeNode r1, TreeNode r2){
        if(r2 == null && r1 == null){
            /* both trees are null so by definition they are the same althought
               they are nothing.
            */ 
            return true;
        } else if (r1 == null || r2 == null){
            /* if one TreeNode ends and the other doesn't 
            */
            return false;
        } else if(r1.data != r2.data){
            /* a tree must match in nodes and data
            */
            return false;
        } else {
            return (matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right));
        }
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
       
       //change the input from any node to a different value to test it
       TreeNode root2 = new TreeNode(20);
       TreeNode n302 = new TreeNode(30);
       TreeNode n102 = new TreeNode(10);
       TreeNode n152 = new TreeNode(15);
       TreeNode n172 = new TreeNode(17);
       TreeNode n52 = new TreeNode(5);
       TreeNode n72 = new TreeNode(7);
       TreeNode n32 = new TreeNode(3);
       root2.right = n302;
       root2.left = n102;
       n102.right = n152;
       n152.right = n172;
       n102.left = n52;
       n52.right = n72;
       n52.left = n32;
       
       System.out.println(containsTree(root, root2));
    }
    
}
