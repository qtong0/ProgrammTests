package tests.algorithm.leetcode;

import binarytree.datastructure.MyBST;

public class MySolutionTests {
	public static void LC228Test() {
		int[][] nums = {
				{0, 1, 2, 4, 5, 7},
				{5},
				{1, 3, 4, 9},
				{},
		};
		for(int[] arr: nums) {
			ILCSolution lc228 = new LeetCode228(arr);
			lc228.myPrint();
		}
	}
	
	public static void LC227Test() {
		String[] expressions = {
				"1*3",
				"1+2",
				"1 * 3 - 5 / 7",
				"0-2147483648",
				"2-1",
				"2*3+4",
		};
		
		for(String expression:expressions) {
			ILCSolution lc227 = new LeetCode227(expression);
			lc227.myPrint();
		}
	}
	
	public static void LC226Test() {
		MyBST tree = new MyBST();
		tree.addNode(4);
		tree.addNode(2);
		tree.addNode(7);
		tree.addNode(9);
		tree.addNode(1);
		tree.addNode(3);
		tree.addNode(6);
		
		new MyBST( new LeetCode226(tree.getHead()).invertTreeRecursive(tree.getHead())).myPrintTree();
	}
}
