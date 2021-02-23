package com;

import java.util.HashMap;

/*
 * Write a function
class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers, returns the number of distinct values in array A.
For example, given array A consisting of six elements such that:
 * A : N개의 정수로 구성 된 배열
 * 배열A의 중복을 제거한 값의 개수를 리턴하라
 */

public class Lesson06_Sorting_04 {

	public static void main(String[] args)
	{
		int[] A = {1, 2, 2};
		
		Lesson06_Sorting_04 test = new Lesson06_Sorting_04();
		test.solution(A);
	}

    public int solution(int[] A) {

    	// HashMap은 중복된 key값을 허용하지 않음으로.
    	int value = 0;
    	HashMap hash = new HashMap();
    	for ( int i : A ) {
    		System.out.println("i :: " + i);
    		System.out.println("A :: " + A[i]);
    		
    		hash.put(i, i);

        	System.out.println(hash.size());
        	System.out.println("-----------------------");
    	}
    	value = hash.size();
    	//System.out.println(value);
    	
    	return value;
    }
    
    
}


