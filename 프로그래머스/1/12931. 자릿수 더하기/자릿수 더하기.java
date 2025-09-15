import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
            
        StringBuilder sb = new StringBuilder();
        
        sb.append(n);
        
        // 123 % 1000 = 123 / 100 = 1
        // 123 % 100 = 23 / 10 = 2
        // 123 % 10 = 3 / 1 = 3
        
        for(double i = 1; i<=sb.toString().length(); i++){
            answer += (n % Math.pow(10, i)) / Math.pow(10, i-1);
        }
        
        return answer;
    }
}