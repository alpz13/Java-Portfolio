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
public class FirstCommonAncestor {
    
    
    // What if P is in the tree but Q not..... need to fix it..
    public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
        //there is no tree
        if(root == null){
            return null;
        }
        // Root, P, Q are the same node
        if(root == p && root == q){
            return root;
        }
        //P, Q are on the left side of root
        TreeNode x = commonAncestor(root.left, p, q);
        if(x != null && x != p && x != q) {
            return x;
        }
        //P, Q are on the right side of the root
        TreeNode y = commonAncestor(root.right, p, q);
        if(y != null && y != p && y != q) {
            return y;
        }
        //P is on one side and Q on another (P - left and Q - right)
        if( x != null && y != null){
            return root;
        } else if(root == p || root == q){
            //P or Q is root and the other one is on either side.
            return root;
        } else {
            
            //Not sure about this....
            return x == null ? y : x;
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
       System.out.println(commonAncestor(root,n30, n30).data);
    }
}
