/*
* @author     Fawzi Aiboud Nygren 2021
* @jdk        Java 8
* @time       O(N) or O(N * log(N))
* @return     amount of times frog has to jump

An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5

the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        the elements of A are all distinct;
        each element of array A is an integer within the range [1..(N + 1)].


*/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        
        Arrays.sort(A);

        if ((A.length == 0) || (A[0] != 1)){        // Safeguard [], [2,3] etc
            return 1;
        }

        if (A.length == 1) {                        // Safeguard single element 
            return A[0] + 1;
        }

        for (int i = 0; i < A.length - 1; i++) {    // Gaps found before N-1
            if (A[i+1] - A[i] != 1) {               // Reverse order since sorted
                return A[i] + 1;
            } else if (i == A.length - 2){          // If last element and no gap found
                return A[A.length-1] + 1;
            } 
        }

        return 0;

    }
}
