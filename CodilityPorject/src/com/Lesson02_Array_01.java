package com;


/*
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 * A 정수배열에 있는 값을 K번만큼 오른쪽으로 밀기
 * int[] A = {1, 2, 3, 4, 5};
 * int B = 1;
 * 결과 : {5, 1, 2, 3, 4}
 */

public class Lesson02_Array_01 {

	public static void main(String[] args)
	{
		int[] A = {1, 2, 3};
		int B = 1;
		
		Lesson02_Array_01 test = new Lesson02_Array_01();
		test.solution(A, B);
	}

    public int[] solution(int[] A, int K) {

        int result[] = new int[A.length];
        
        for (int i = 0; i < A.length; i++) {
            result[(i + K) % A.length] = A[i];
        }
		return result;
    }
    
    
}


