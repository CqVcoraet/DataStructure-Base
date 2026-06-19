package SpecialExtra;

public class SpecialMethods {
    
    /**
     * 
     * @param m
     * @param n
     * @return the answer
     */
    public static int ack(int m, int n) {
        int answer;
        if (m == 0) {
            answer = n + 1;
        } else if (n == 0) {
            answer = ack(m - 1, 1);
        } else {
            answer = ack(m - 1, ack(m, n - 1));
        }
        return answer;
    }
}
