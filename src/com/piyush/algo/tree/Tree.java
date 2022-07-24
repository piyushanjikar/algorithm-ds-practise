/**
 * 
 */
package com.piyush.algo.tree;

/**
 * @author piyushanjikar
 *
 */
public class Tree {
	
	private Node root;
	
	
	public void add(int data) {
		Node newNode = new Node(data);

		if(root == null) {
			root = newNode;
		} else {
			Node currentNode = root;
			
			while(currentNode != null) {
				if(currentNode.getData() > data) {
					
					if(currentNode.getLeft() == null) {
						currentNode.setLeft(newNode);
						break;
					} else {
						currentNode = currentNode.getLeft();
					}
				} else {
					
					if(currentNode.getRight() == null) {
						currentNode.setRight(newNode);
						break;
					} else {
						currentNode = currentNode.getRight();
					}
				}
				
			}
		}
	}
	
	public Node getRoot() {
		return root;
	}

}
