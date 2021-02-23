package com;

import java.util.Stack;

/*
 * You are going to build a stone wall. The wall should be straight and N meters long, and its thickness should be constant; however, it should have different heights in different places. The height of the wall is specified by an array H of N positive integers. H[I] is the height of the wall from I to I+1 meters to the right of its left end. In particular, H[0] is the height of the wall's left end and H[N?1] is the height of the wall's right end.
돌담 : N 미터 길이, 두께는 일정
다른 곳에 다른 높이를 가져야 함.
배열 H : 돌담의 높이가 적힌 양의 정수 N으로 구성 됨
H[i] : 왼쪽에서 오른쪽으로 i 에서 i + 1까지의 벽의 높이
H[0] : 벽의 왼쪽 끝의 높이
H[N-1] : 벽의 오른쪽 끝의 높이
벽은 직육면체로 지어야 한다.
각 블록의 모든 면은 직사각형
돌벽을 모두 짓는데 필요한 최소 블럭 수를 반환하라.

스택 기본 함수
추가 및 삭제
push(element) : top에 원소를 추가
pop() : top에 있는 원소를 삭제
조회
top() : top(스택의 처음이 아닌 가장 끝)에 있는 원소를 반환
기타
empty() : 스택이 비어있으면 true 아니면 false를 반환
size() : 스택 사이즈를 반환
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


