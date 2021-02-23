package com;

import java.util.Stack;

/*
 * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

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


