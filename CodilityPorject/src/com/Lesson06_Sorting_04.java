package com;

import java.util.HashMap;

/*
 * Write a function
class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers, returns the number of distinct values in array A.
For example, given array A consisting of six elements such that:
 * A : N���� ������ ���� �� �迭
 * �迭A�� �ߺ��� ������ ���� ������ �����϶�
 */

public class Lesson06_Sorting_04 {

	public static void main(String[] args)
	{
		int[] A = {1, 2, 2};
		
		Lesson06_Sorting_04 test = new Lesson06_Sorting_04();
		test.solution(A);
	}

    public int solution(int[] A) {

    	// HashMap�� �ߺ��� key���� ������� ��������.
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


