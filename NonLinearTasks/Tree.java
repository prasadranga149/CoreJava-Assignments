package NonLinearTasks;

public class Tree {
	int val;
	Tree left;
	Tree right;
	
	public Tree(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
		
	}

}

     class BinarySearchTree{
    	 private Tree root;
    	 
    	 public BinarySearchTree() {
    		 this.root = null;
    	 }
    	 
    	 public void insert(int val) {
    		 root = insertRecursive(root, val);
    		 
    	 }
    	 
    	 private Tree insertRecursive(Tree root,int val) {
    		 if(root == null) {
    			 root = new Tree(val);
    			 return root;
    			 
    		 }
    		 
    		 if (val < root.val) {
    			 root.left = insertRecursive(root.left,val);
    		 } else if (val> root.val) {
    			 root.right = insertRecursive(root.right,val);
    		 }
    		 
    		 return root;
    	 }
    	 public void delete(int val) {
    		 root = deleteRecursive(root, val);
    	 }
    	 private Tree deleteRecursive(Tree root , int val) {
    		 if (root == null) {
    			 return root;
    		 }
    		 
    		 if (val < root.val) {
    			 root.left = deleteRecursive(root.left,val);
    		 } else if (val>root.val) {
    			 root.right = deleteRecursive(root.right,val);
    		 }else {
    			 if (root.left == null) {
    				 return root.right;
    			 } else if(root.right ==null) {
    				 return root.left;
    			 }
    			 
    			 root.val = minValue(root.right);
    			 
    			 root.right = deleteRecursive(root.right,root.val);
    		 }
    		 return root;
    	 }
    	 private int minValue(Tree root) {
    		 int minValue= root.val;
    		 while (root.left !=null) {
    		      minValue = root.left.val;
    		      root=root.left;
    	 }
    	 return minValue;
     }
    	 
    	 public void inorderTraversal() {
    		 inordrRecursive(root);
    		 System.out.println();
    	 }
    	 private void inordrRecursive(Tree root) {
    		 if (root !=null) {
    			 inordrRecursive(root.left);
    			 System.out.println(root.val + " ");
    			 inordrRecursive(root.right);
    		 }
    	 }
    	 public void preorderTRaversal() {
    		 preorderRecursive(root);
    		 System.out.println();
    	 }
    	 private void preorderRecursive(Tree root) {
    		 if(root != null) {
    			 System.out.print(root.val +" ");
    			 preorderRecursive(root.left);
    			 preorderRecursive(root.right);
    		 }
    	 }
    	 public void postorderRecursive(Tree root) {
    		 if(root != null) {
    			 postorderRecursive(root.left);
    			 postorderRecursive(root.right);
    			 System.out.print(root.val +" ");
    		 }
    	 }
    	 public static void main(String[]args) {
    		 BinarySearchTree bst = new BinarySearchTree();
    		 bst.insert(22);
    		 bst.insert(32);
    		 bst.insert(42);
    		 bst.insert(52);
    		 bst.insert(62);
    		 bst.insert(72);
    		 bst.insert(82);
    		 
    		 System.out.println("Inorder traversal:");
    		 bst.inorderTraversal();
    		 
    		 System.out.println("Preorder traversal:");
    		 bst.inorderTraversal();
    		 
    		 System.out.println("Postorder traversal:");
    		 bst.inorderTraversal();
    		 
    		 bst.delete(42);
    		 bst.delete(32);
    		 
    		 System.out.println("Inorder traversal after deletion:");
    		 bst.inorderTraversal();
    	 }
     }
     
    		
    		 
    		 
    		 
    			 
    		 
    		 
     
     
    			 
    			 
    	
    	 
   