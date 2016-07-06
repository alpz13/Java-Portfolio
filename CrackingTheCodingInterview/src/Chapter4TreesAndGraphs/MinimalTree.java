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
public class MinimalTree {
    
    public static TreeNode createMinimalBST(int arr[]){
        return createMinimal(arr, 0,arr.length-1);
        
    }
    
    public static TreeNode createMinimal(int arr[], int start, int end){
        if(end < start){
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = createMinimal(arr,start,mid-1);
        n.right = createMinimal(arr,mid + 1,end);
        return n;
    }
    
    private static void inorder(TreeNode r){
        if(r != null){
            inorder(r.getLeft());
            System.out.print(r.data + " ");
            inorder(r.getRight());
        }
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        TreeNode root = createMinimalBST(arr);
        inorder(root);
        
    }
    
}
