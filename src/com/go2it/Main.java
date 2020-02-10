package com.go2it;

/**
 * @author Alex Ryzhkov
 */
public class Main {
	public static int sum(int i, int j) {
		return i + j;
	}

	public static int divideAlex(int i, int j) {
		return i/j;
	}

/**@adding two functions by Olga**/
	public static int substractOlga(int i, int j) {return i-j;}

	public static int divideOlga(int i, int j) {
		if (j != 0) {
			i / j
		} else {
			System.out.println("Division by Zero!");
		}
	}
/*end of Olga's code*/

	public static void main(String[] args) {
		sum(1, 2);
		substractOlga(5, 3);
		divideOlga(8,4);
	}
}
