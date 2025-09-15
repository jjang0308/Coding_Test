import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        
        // 12345
        // 01234
        // 4,5
        // 3,4
        // 2,3
        // 1,2
        // 0,1
        String s = sb.toString();
        int[]answer = new int[s.length()];
        for(int i = 0; i<s.length(); i++){
            answer[i] = Integer.parseInt(s.substring(s.length()-i-1, s.length()-i));
        }
        System.out.print(s.length());
        System.out.print(s.substring(0,1));
        return answer;
    }
}