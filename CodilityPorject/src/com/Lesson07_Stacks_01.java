package com;

import java.util.Stack;

/*
 * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

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

public class Lesson07_Stacks_01 {

	public static void main(String[] args)
	{
		String S = "";
		
		Lesson07_Stacks_01 test = new Lesson07_Stacks_01();
		test.solution(S);
	}

    public int solution(String S) {

    	Stack<Character> stack = new Stack<>();
    	char lastChar;
    	
    	for (char c : S.toCharArray()) {
    		if (c == '(' || c == '[' || c == '{') stack.push(c);
    		else {
    			if (stack.empty()) return 0;
    			lastChar = stack.pop();
    			if (c == ')' && lastChar != '(') return 0;
    			else if (c == ']' && lastChar != '[') return 0;
    			else if (c == '}' && lastChar != '{') return 0;
    		}
    	}
    	return stack.isEmpty() ? 1 : 0;
    }
    
    
}


