package tree;
//Java program to delete element in binary tree 
import java.util.*;

public class BinaryTree {
	
	static class Node {
		
		int key;
		Node left,right;
		
		// constructor
		public Node(int key) {
			
			this.key = key;
			this.left = null;
			this.right = null;
			
		}
			
	}
	
	static Node root;
	static Node temp = root;
	
	/* Inorder traversal of a binary tree*/
	public static void inorder(Node temp) {
		if(temp == null)
			return;
		
		
		inorder(temp.left);
		System.out.print(temp.key +" ");
		inorder(temp.right);
		
	}
	
	/*function to insert element in binary tree */
	public static void insert(Node temp, int key) {
		
		Queue<Node> q = new LinkedList<>();
		q.add(temp);
		
		// Do level order traversal until we find 
        // an empty place. 
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			
			if(temp.left == null) {
				temp.left = new Node(key);
				return;
			}else {
				q.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new Node(key);
				return;
			}else {
				q.add(temp.right);
			}
		}
	}
	
	/* method to delete the given deepest node 
	(d_node) in binary tree */
	public static void deletDeepest(Node root, Node d_node) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		// Do level order traversal until last node
		Node temp;
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			
			if(temp == d_node) {
				temp = null;
				return;
			}
			if(temp.right != null) {
				if(temp.right == d_node) {
					temp.right = null;
					return;
				}else {
					q.add(temp.right);
				}
			}
			
			if(temp.left != null) {
				if(temp.left == d_node) {
					temp.left = null;
					return;
				}else {
					q.add(temp.left);
				}
			}
		}
	}
	
	/* function to delete element in binary tree */
	public static Node  deletion(Node root, int key) {
		if(root == null) return null;
		
		if(root.left == null && root.right == null){
			if(root.key == key) {
				return null;
			}else {
				return root;
			}
		}
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		Node temp = null;
		Node key_node = null;
		
		// Do level order traversal to find deepest 
		// node(temp) and node to be deleted (key_node)
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			
			if(temp.key == key) key_node = temp;
			
			if(temp.left != null) q.add(temp.left);
			
			if(temp.right != null) q.add(temp.right);
		
		}
		
		if(key_node != null) {
			int x = temp.key;
			deletDeepest(root, temp);
			key_node.key = x;
		}
		
		return root;
	}
	
	// Driver code
	public static void main(String[] args) {
		
		root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7);
        root.left.right = new Node(12); 
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
        
        System.out.print( "Inorder traversal before insertion:"); 
        inorder(root);
        System.out.println();
        
        deletion(root,11);
       
        System.out.print( "Inorder traversal after insertion:"); 
        inorder(root);

	}

}
