/**
 * 
 */
package com.piyush.algo.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author piyushanjikar
 *
 */
public class InsertionSort {
	
	
	public static void sort(List<Integer> list) {
		
		for(int i = 1; i < list.size(); i++) {
			
			int key = list.get(i);
			int j = i -1;
			
			/*
			 * Shift elements of lis(0...i-1) that are greater than key, to one position
			 * ahead of their current position
			 */
			while ( j >= 0 && list.get(j) > key ) {
				list.set(j+1, list.get(j));
				j--;
				
			}

			list.set(j+1, key);

		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number elements:");
		int length = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		while(length > 0 ) {
			list.add(sc.nextInt());
			length--;
		}
		
		sort(list);
		
		list.forEach(System.out::println);

	}

}
