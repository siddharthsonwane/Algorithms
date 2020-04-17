package algorithms;

public class BinarySearchTree {

	class Node {

		int key;

		Node left, right;

		Node(int item) {
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;
	
	
	public BinarySearchTree() {
    
		root = null;
	}
	
	
	// method to insert item
	
	void insert(int key) {
		
		root = insertRecord(root, key);
		
	}
	
	
	private Node insertRecord(Node root, int key) {

		  // if the tree  is empty then return  new node
		  if(root == null) {
			  root = new Node(key);
			  return root;
		  }
		  
		  if(key < root.key) {
			  
			  root.left = insertRecord(root.left, key);
			}else if(key > root.key) {
				
				root.right = insertRecord(root.right, key);
				
			}
		
		System.out.println("key"+root.key);  
		
		return root;
	}

	
	// deleteRecord
	
	void deletekey(int key) {
		
		root = deleteRec(root,key);
	}
	
	
	private Node deleteRec(Node root, int key) {

		if(root ==null) {
			return root;
		}
		
		if(key < root.key) {
			
			root.left = deleteRec(root.left,key);
		}else if(key > root.key) {
		
			root.right = deleteRec(root.right, key);

		}
		
		 // if key is same as root's key, then This is the node 
        // to be deleted
		else {
			
			// node with only one child or no child 
			if(root.left == null) {
				return root.right;
			}else if(root.right ==  null) {
				return root.left;
			}
			
			// node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
			
			root.key = minValue(root.right);
			
			 // Delete the inorder successor 
			
			root.right = deleteRec(root.right,root.key);
			
			
		}
		
		return root;
	}


	private int minValue(Node root) {
     
		int minv = root.key;
		while(root.left != null) {
			
			minv = root.left.key;
			root = root.left;
		}
		
		return minv;
	}


	void inorder() {
		
		inorderRec(root);
	}
	
	

	private void inorderRec(Node root) {

		if(root !=null) {
			
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
			
			
		}
		
	}


	public static void main(String[] args) {
		
     BinarySearchTree tree = new BinarySearchTree();

     tree.insert(50); 
     tree.insert(30); 
     tree.insert(20); 
     tree.insert(40); 
     tree.insert(70); 
     tree.insert(60); 
     tree.insert(80); 
	   
     System.out.println("Inorder traversal of the given tree"); 
     tree.inorder(); 

     
     System.out.println("\nDelete 20"); 
     tree.deletekey(20); 
     System.out.println("Inorder traversal of the modified tree"); 
     tree.inorder(); 
     
     
     
     System.out.println("\nDelete 30"); 
     tree.deletekey(30); 
     System.out.println("Inorder traversal of the modified tree"); 
     tree.inorder();
     
     
     System.out.println("\nDelete 50"); 
     tree.deletekey(50); 
     System.out.println("Inorder traversal of the modified tree"); 
     tree.inorder(); 
     

	}

}
