package Chapter4TreesAndGraphs;

public class CheckBSTTree {
	
	public static boolean isBST(TreeNode root) {
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private static boolean checkBST(TreeNode node, int min, int max) {
		if(node == null) {
			return true;
		}
		
		if(node.data < min || node.data > max) {
			return false;
		}
		
		return (checkBST(node.left, min, node.data - 1) && 
				checkBST(node.right, node.data + 1, max));
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
        root.insertInOrder(1);
        root.insertInOrder(0);
        root.insertInOrder(2);
        
        System.out.println(isBST(root));
	}

}
