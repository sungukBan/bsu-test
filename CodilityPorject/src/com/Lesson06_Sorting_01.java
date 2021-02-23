package com;

import java.util.Arrays;

/*
 * An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 �� P < Q < R < N and:
 * �ߺ����� �ʴ� �ε��� 3������ �����ϰ�, 2���� �ε��� ���� ���� ������ 1������ �ε��� ������ ��� ū ��찡 �����ϴ��� ã�� ����
 */

public class Lesson06_Sorting_01 {

	public static void main(String[] args)
	{
		int[] A = {1, 2, 2};
		
		Lesson06_Sorting_01 test = new Lesson06_Sorting_01();
		test.solution(A);
	}

    public int solution(int[] A) {
        Arrays.sort(A);//�迭�� ��ҵ��� �������ش�.

        for (int i = 0; i < A.length - 2; i++) {
            //if (A[i] + A[i+1] > A[i + 2]) {//������ �ε��� 3������ ���Ѵ�.
            if (A[i + 1] > A[i + 2] - A[i]) {//�����÷ο찡 �߻����� �ʵ��� ���� ����
                return 1; //�Ѱ��� ���� �����ϸ� �ٷ� 1�� �����Ѵ�.
            }
        }
        return 0;
    }
    
    
}


