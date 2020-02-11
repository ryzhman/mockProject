package com.go2it;

/**
 * @author Alex Ryzhkov
 */
public class Main {
    public static int sum(int i, int j) {
        return i + j;
    }

    public static int divideAlex(int i, int j) {
        return i / j;
    }


    public static void main(String[] args) {
        sum(1, 2);

		System.out.println(modulusDiv(10,3));
    }

    public static boolean modulusDiv(int firstInt, int secondInt) {
        if (firstInt % secondInt == 0) {
            return true;
        }
        return false;
    }

}
