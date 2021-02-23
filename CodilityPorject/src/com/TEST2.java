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
    
    
    
    
}


