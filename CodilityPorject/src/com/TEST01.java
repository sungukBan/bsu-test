package com;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


public class TEST01 {

	public static void main(String[] args)
	{
		String S = "BALLOON";
		
		TEST01 test = new TEST01();
		test.solution(S);
	}

    public String solution(String S) {

        int[][] occurrences = new int[26][S.length()];
        for (int i = 0; i < S.length(); i++) {
            occurrences[S.charAt(i) - 'a'][i]++;
            for (int j = 0; j < 26; j++) {
                if (i > 0)occurrences[j][i] += occurrences[j][i - 1];
            }
        }

        
        int q = Reader.nextInt();
        for (int i = 0; i < q; i++) {
          int a = Reader.nextInt();
          int b = Reader.nextInt();
          int c = Reader.nextInt();
          int d = Reader.nextInt();
          int[] ab = letterOccurrences(occurrences, a, b);
          int[] cd = letterOccurrences(occurrences, c, d);
        }
        
        
        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 1; i < 26; i++) {
            if (occurrences[i] >= best_res) {
                best_char = (char)((int)'a' + i);
                best_res  = occurrences[i];
            }
        }

        return Character.toString(best_char);
    	
    }
    
    private static int[] letterOccurrences(int[][] occurrences, int a, int b){
        a--;
        b--;
        int[] occurr = new int[26];
        if (a == 0){
            for (int i = 0; i < occurr.length; i++) {
                occurr[i] = occurrences[i][b];
            }
        }
        else {
            for (int i = 0; i < occurr.length; i++) {
                occurr[i] = occurrences[i][b] - occurrences[i][a - 1];
            }
        }
        return occurr;
    }

    private static boolean compare(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])return false;
        }
        return true;
    }
    
    
    public String solution22(String S) {

        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 1; i < 26; i++) {
            if (occurrences[i] >= best_res) {
                best_char = (char)((int)'a' + i);
                best_res  = occurrences[i];
            }
        }

        return Character.toString(best_char);
    	
    }
    
    
}


