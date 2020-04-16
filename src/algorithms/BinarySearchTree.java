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

	   tree.insert(10);
	   tree.insert(30);
	   tree.insert(20);
	   tree.insert(50);
	   tree.insert(90);
	   tree.insert(40);
	   tree.insert(60);
	   tree.insert(70);
	   tree.insert(80);
	   tree.insert(02);
	   tree.insert(03);
	   tree.insert(05);
	   tree.insert(06);
	   
	   
	   tree.inorder();

	}

}
