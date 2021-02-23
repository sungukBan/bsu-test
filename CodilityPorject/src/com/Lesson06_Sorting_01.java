package com;

import java.util.Arrays;

/*
 * An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
 * 중복되지 않는 인덱스 3가지를 선택하고, 2가지 인덱스 값의 합이 나머지 1가지의 인덱스 값보다 모두 큰 경우가 존재하는지 찾는 문제
 */

public class Lesson06_Sorting_01 {

	public static void main(String[] args)
	{
		int[] A = {1, 2, 2};
		
		Lesson06_Sorting_01 test = new Lesson06_Sorting_01();
		test.solution(A);
	}

    public int solution(int[] A) {
        Arrays.sort(A);//배열의 요소들을 정렬해준다.

        for (int i = 0; i < A.length - 2; i++) {
            //if (A[i] + A[i+1] > A[i + 2]) {//인접한 인덱스 3가지를 비교한다.
            if (A[i + 1] > A[i + 2] - A[i]) {//오버플로우가 발생하지 않도록 식을 변형
                return 1; //한가지 경우라도 만족하면 바로 1을 리턴한다.
            }
        }
        return 0;
    }
    
    
}


