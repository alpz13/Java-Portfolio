/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author alex
 */
public class BinarySearchTree {
    
    private Node root;
    
    public BinarySearchTree(){
        root = null;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public void insert(int data){
        root = insert(root, data);
    }
    
    private Node insert(Node node, int data){
        if(node == null){
            node = new Node(data);
        } else {
            if(data<= node.getData()){
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }  
        }
        return node;
    }
    
    public void delete(int k){
        if(isEmpty()){
            System.out.println("Empty tree");
        } else if(search(k) == false){
            System.out.println("Element "+ k + " is not in the tree");
        } else {
            root = delete(root, k);
            System.out.println(k + " deleted from tree");
        }
    }
    
    private Node delete(Node root, int k){
        Node p, p2, n;
        if(root.getData() == k){
            Node lt, rt;
            lt = root.getLeft();
            rt = root.getRight();
            if(lt == null && rt == null){
                return null;
            } else if(lt == null){
                p = rt;
                return p;
            } else if(rt == null){
                p = lt;
                return p;
            } else {
                p2 = rt;
                p = lt;
                while(p.getLeft() != null){
                    p = p.getLeft();
                }
                p.setLeft(lt);
                return p2;
            }
        }
        if(k < root.getData()){
            n = delete(root.getLeft(), k);
            root.setLeft(n);
        } else {
            n = delete(root.getRight(), k);
            root.setRight(n);
        }
        return root;
    }
    
    public int countNodes(){
        return countNodes(root);
    }
    
    private int countNodes(Node r){
        if(r == null){
            return 0;
        } else {
            int x = 1;
            x += countNodes(r.getLeft());
            x += countNodes(r.getRight());
            return x;
        }
    }
    
    public boolean search(int val){
        return search(root,val);
    }
    
    private boolean search(Node n, int val){
    
        boolean found = false;
        while((n != null) && !found){
            int rval = n.getData();
            if(val < rval){
                n = n.getLeft();
            } else if(val > rval){
                n = n.getRight();
            } else {
                found = true;
                break;
            }
            found = search(n,val);
        }
        return found;
    }
    
    public void inorder(){
        inorder(root);
    }
    
    private void inorder(Node r){
        if(r != null){
            inorder(r.getLeft());
            System.out.print(r.data + " ");
            inorder(r.getRight());
        }
    }
    
    public void preorder(){
        preorder(root);
    }
    
    private void preorder(Node r){
        if(r != null){
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }
    
    public void postorder(){
        postorder(root);
    }
    
    private void postorder(Node r){
        if(r != null){
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
    
}
