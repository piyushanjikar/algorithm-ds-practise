/**
 * 
 */
package com.piyush.algo.tree;

/**
 * @author piyushanjikar
 *
 */
public class DFS {

	//       9
	//   4       20
	// 1   6  15     170

	private Tree tree;

	public DFS() {
		tree = new Tree();
		tree.add(9);
		tree.add(4);
		tree.add(20);
		tree.add(1);
		tree.add(6);
		tree.add(15);
		tree.add(170);
	}

	public void print() {
		System.out.println("InOrder:");
		inOrder(tree.getRoot());
		
		System.out.println("PreOrder:");
		preOrder(tree.getRoot());
		
		System.out.println("PostOrder:");
		postOrder(tree.getRoot());
	}

	// Left -> Root -> Right
	private void inOrder(Node node) {

		if (node == null) {
			return;
		}

		if (node.getLeft() != null) {
			inOrder(node.getLeft());
		}

		System.out.println(node.getData());

		if (node.getRight() != null) {
			inOrder(node.getRight());
		}

	}

	// Root -> Left -> Right
	private void preOrder(Node node) {

		if (node == null) {
			return;
		}
		
		System.out.println(node.getData());

		if (node.getLeft() != null) {
			preOrder(node.getLeft());
		}

		if (node.getRight() != null) {
			preOrder(node.getRight());
		}

	}
	
	// Left -> Right -> Root
	private void postOrder(Node node) {

		if (node == null) {
			return;
		}

		if (node.getLeft() != null) {
			postOrder(node.getLeft());
		}

		if (node.getRight() != null) {
			postOrder(node.getRight());
		}
		
		System.out.println(node.getData());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new DFS().print();

	}

}
