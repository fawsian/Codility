/*
* @author     Fawzi Aiboud Nygren 2021
* @jdk        Java 8
* @time       O(N)
* @return     return minimal difference from absolute value split

A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3

We can split this tape in four places:

        P = 1, difference = |3 − 10| = 7
        P = 2, difference = |4 − 9| = 5
        P = 3, difference = |6 − 7| = 1
        P = 4, difference = |10 − 3| = 7

Write a function:

    class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.

For example, given:
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3

the function should return 1, as explained above.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [2..100,000];
        each element of array A is an integer within the range [−1,000..1,000].
*/

class Solution {
    public int solution(int[] A) {

      int first = 0;
      int second = 0;
      int sum = 0;
      int abs = 0;
      int min = 0;

      for (int i = 0; i < A.length; i++) {
        sum += A[i];
      }

      for (int i = 0; i < A.length-1; i++) {

        first += A[i];
        second = (first-sum) * -1;      // Can't use abs here, or negative numbers won't work
        abs = Math.abs(first-second);

        if (i == 0) {
            min = abs;
        } 
        min = Math.min(min, abs);      
      }        
      return min;
    }
}

