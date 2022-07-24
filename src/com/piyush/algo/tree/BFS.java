/**
 * 
 */
package com.piyush.algo.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author piyushanjikar
 *
 */
public class BFS {
	
	private Queue<Node> queue;
	private Tree tree;
	
	public BFS() {
		queue = new LinkedList<Node>();
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
		Node current = tree.getRoot();
		queue.add(current);
		
		
		while(!queue.isEmpty()) {
			current = queue.peek();
			queue.remove();
			System.out.println(current.getData());
			
			if(current.getLeft() != null) {
				queue.add(current.getLeft());
			}
			
			if(current.getRight() != null) {
				queue.add(current.getRight());
			}
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BFS bfs = new BFS();
		bfs.print();

	}

}
