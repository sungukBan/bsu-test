package com;

import java.util.Stack;

/*
 * You are going to build a stone wall. The wall should be straight and N meters long, and its thickness should be constant; however, it should have different heights in different places. The height of the wall is specified by an array H of N positive integers. H[I] is the height of the wall from I to I+1 meters to the right of its left end. In particular, H[0] is the height of the wall's left end and H[N?1] is the height of the wall's right end.
���� : N ���� ����, �β��� ����
�ٸ� ���� �ٸ� ���̸� ������ ��.
�迭 H : ������ ���̰� ���� ���� ���� N���� ���� ��
H[i] : ���ʿ��� ���������� i ���� i + 1������ ���� ����
H[0] : ���� ���� ���� ����
H[N-1] : ���� ������ ���� ����
���� ������ü�� ����� �Ѵ�.
�� ����� ��� ���� ���簢��
������ ��� ���µ� �ʿ��� �ּ� �� ���� ��ȯ�϶�.

���� �⺻ �Լ�
�߰� �� ����
push(element) : top�� ���Ҹ� �߰�
pop() : top�� �ִ� ���Ҹ� ����
��ȸ
top() : top(������ ó���� �ƴ� ���� ��)�� �ִ� ���Ҹ� ��ȯ
��Ÿ
empty() : ������ ��������� true �ƴϸ� false�� ��ȯ
size() : ���� ����� ��ȯ
 */

public class Lesson07_Stacks_04 {

	public static void main(String[] args)
	{
		int[] S = {1, 2, 2};
		
		Lesson07_Stacks_04 test = new Lesson07_Stacks_04();
		test.solution(S);
	}

    public int solution(int[] H) {

    	  Stack<Integer> stack = new Stack<>();

    	  int count = 0;
    	  for (int i = 0; i < H.length; i++) {
    	    while (!stack.isEmpty() && stack.peek() > H[i]) {
    	      stack.pop();
    	    }
    	    if (stack.isEmpty() || stack.peek() < H[i]) {
    	      stack.push(H[i]);
    	      count++;
    	    }
    	  }
    	  return count;
    }
    
    
}


