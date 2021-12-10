//*********************************************************************************
// CSC205: 33640 / online
// Program: BSTree
// Author: Jose Solis & 35558159
// Description: Implements Tree.java for Binary Search Tree implementation
//*********************************************************************************


public class BSTree<T extends Comparable <T>> implements Tree<T>{
	
	Node<T> root;
	int treeSize;

	BSTree(){
		this.root = null;
		this.treeSize = 0;
	}

	BSTree(T item){
		this.root = new Node<T>(item);
		this.treeSize = 1;
	}

	//====================Assignement methods========================

	@Override
	public void add(T item){

		if(!this.contains(item)){
			
			this.treeSize++;
			
			if(this.root == null){
				this.root = new Node<T>(item);
			}
			else{
				this.root.add(item);		
			}
		}

	}

        @Override
	public boolean contains(T item){
		
		if(this.root == null){
			return false;
		}

		return this.containsNode(this.root, item);
	}

        @Override
	public int size(){
		return this.treeSize;
	}

        @Override
	public void inOrderPrint(){
		System.out.println(this.toString());
	}

        @Override
	public String toString(){
		String treeOrder = "";
		if(this.root == null){
			return treeOrder;
		}
		return this.inorderString(this.root, treeOrder);
	}

	//====================My methods========================
	
	private boolean containsNode(Node<T> node, T item){
		// compare comparable objects
		int comparison = node.data.compareTo(item);
		
		// go left
		// this > item
		boolean goLeft = comparison > 0;
		
		// go right
		// this < item
		boolean goRight = comparison < 0;
		
		if(goLeft){
			// check if left child is null
			if(node.left == null){
				// left child is null
				// this node is greater than item and left node is null, does not contain
				return false;
			}
			else{
				// not null and less than this node, go left
				return this.containsNode(node.left, item);
			}
		}
		else if(goRight){
			// check if right child is null
			if(node.right == null){
				// this node is less than item and right child is null, does not contain
				return false;
			}
			else{
				// not null and greater than this node, go right
				return this.containsNode(node.right, item);
			}
		}

		// if made it to here then node.data == item
		return true;
	}

	private String inorderString(Node<T> node, String builder){
		
		if(node.left != null){
			builder = inorderString(node.left, builder);
		}
		
		builder+=node.data.toString() + " ";

		if(node.right != null){
			builder = inorderString(node.right, builder);
		}
		
		return builder;
	}

	// ===== nested Node class =====

	class Node<T extends Comparable <T>>{
		public Node<T> left;
		public Node<T> right;
		public T data;

		Node(T item){
			this.left = null;
			this.right = null;
			this.data = item;
		}
		
		public void add(T item){
			// compare comparable objects
			int comparison = this.data.compareTo(item);
			
			// go left
			// this > item
			boolean goLeft = comparison > 0;
			
			// go right
			// this < item
			boolean goRight = comparison < 0;
			
			if(goLeft){
				// check if left child is null
				if(this.left == null){
					// left child is null
					// this node is greater than item and left node is null, setting left child to item
					this.left = new Node<T>(item);
				}
				else{
					// not null and less than this node, go left
					this.left.add(item);
				}
			}
			else if(goRight){
				// check if right child is null
				if(this.right == null){
					// this node is less than item and right child is null, setting item as right child
					this.right = new Node<T>(item);
				}
				else{
					// not null and greater than this node, go right
					this.right.add(item);
				}
			}

			// if made it to here then this item is already in tree, do nothing and return
			return;
		}
	}
}
