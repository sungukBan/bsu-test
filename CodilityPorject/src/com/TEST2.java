package com;

import java.util.ArrayList;
import java.util.List;


public class TEST2 {

	public static void main(String[] args)
	{
		String S = "BALLOON";
		
		TEST2 test = new TEST2();
		test.solution(S);
	}

    public int solution(String S) {

		int cnt = 0;
		String sBall  = "BALLOON";
		char[] cball  = sBall.toCharArray();
		char[] cSData = S.toCharArray();
		List<Character> cList = new ArrayList<Character>();
		
		for (char c : cSData) {
			cList.add(c);
		}

		boolean rtn = true;
		while (rtn) {

			for (int i = 0; i < cball.length; i++) {

				if (cList. contains(cball[i])) {
					cList. remove((Character) cball[i]);
				} else {
					rtn = false;
				}
			}
			
			if (rtn) {
				cnt++;
			}
		}
		return cnt;
    }
    
    

/*
A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.
작은 개구리가 강 건너편으로 가고 싶어합니다. 개구리는 처음에 강의 한 둑 (위치 0)에 있으며 반대쪽 둑 (위치 X + 1)에 도달하려고합니다. 잎은 나무에서 강 표면으로 떨어집니다.

You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.
낙엽을 나타내는 N 개의 정수로 구성된 배열 A가 제공됩니다. A [K]는 초 단위로 측정 된 시간 K에서 한 잎이 떨어지는 위치를 나타냅니다.

The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.
목표는 개구리가 강 반대편으로 점프 할 수있는 가장 빠른 시간을 찾는 것입니다. 개구리는 잎이 1에서 X까지 강 건너 모든 위치에 나타날 때만 건널 수 있습니다 (즉, 1에서 X까지의 모든 위치가 잎으로 덮여있는 가장 빠른 순간을 찾고 싶습니다). 강의 흐름 속도가 무시할 정도로 작다고 가정 할 수 있습니다. 즉, 잎이 강에 떨어지면 위치가 바뀌지 않습니다.

For example, you are given integer X = 5 and array A such that:
예를 들어, 정수 X = 5와 다음과 같은 배열 A가 제공됩니다.

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4

In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.
두 번째 6에서는 잎이 위치 5로 떨어집니다. 이것은 잎이 강 건너 모든 위치에 나타나는 가장 빠른 시간입니다.

Write a function:

class Solution { public int solution(int X, int[] A); }

that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.
N 개의 정수와 X로 구성된 비어 있지 않은 배열 A가 주어지면 개구리가 강 반대편으로 점프 할 수있는 가장 빠른 시간을 반환합니다.

If the frog is never able to jump to the other side of the river, the function should return −1.
개구리가 강 반대편으로 점프 할 수없는 경우 함수는 −1을 반환해야합니다.

For example, given X = 5 and array A such that:
예를 들어, 주어진 X = 5이고 배열 A는 다음과 같습니다.

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
the function should return 6, as explained above.

문제요약

 개구리가 나뭇잎을 밣고목표지점까지 건너가야한다.

 나뭇잎은 매초마다 여러위치에 랜덤으로 떨어진다.

 주어진 배열의 인덱스는 '초'를 의미하며, 요소값은 나뭇잎이이 떨어 지는 위치를 의미한다.

 나뭇잎이 목표지점까지 모두 떨어져 있어야 건너갈 수있다. 건너 갈수 없다면 -1 리턴.

 목표지점이 10이라면 11까지 가야된다.



이번에는 목표지점을 넘어서의 값은 필요없기 때문에  6행을 통해서 값을 담았다.

그리고 10행의 조건문을 통해 목표지점까지 걸리는 시간값을 출력했다.

만약에 10행에 해당하는 조건이 없다면 각 위치간에 나뭇잎이 없는 곳이 있다는 의미이고

마지막에 return -1을 해버렸다.

class Solution {
    public int solution(int X, int[] A) {
        HashSet<Integer> distance = new HashSet<>();
 
        for (int i=0 ; i<A.length;i++) {
            if (A[i] <= X) {
                distance.add(A[i]);
            }
 
            if (distance.size() == X) {
                return i;
            }
 
        }
 
        return -1;
    }
}

*/
	
    
}


