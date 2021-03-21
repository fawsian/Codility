/*
* @author     Fawzi Aiboud Nygren 2021
* @jdk        Java 8
* @time       O(1)
* @return     amount of times frog has to jump
*/

class Solution {
    public int solution(int X, int Y, int D) {
        
        int counter = 0;
        int distance = Y-X;

        if (X == Y) {
            return 0;
        }

        if (distance%D == 0) {
            return distance/D;
        } else if (distance%D < D){
            return distance/D + 1;
        }
        // Should never occur
        return 0;

    }
}
