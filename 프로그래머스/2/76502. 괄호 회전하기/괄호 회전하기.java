import java.util.*;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<Character> q = new LinkedList<>();
        for (char c : s.toCharArray()) {
            q.offer(c);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = q.poll();
            q.offer(c);

            //검증
            Stack<Character> stack = new Stack<>();
            boolean isVaild = true;
            for(char c2 : q){
                if(c2 == '(' || c2 == '{' || c2 == '['){
                    stack.push(c2);
                } else{
                    if(stack.isEmpty()){
                        isVaild = false;
                        break;
                    }
                    char top = stack.peek();
                    if((c2 == ')' && top == '(')|| (c2 == '}' && top == '{') || (c2 == ']' && top == '[')){
                        stack.pop();
                    }else{
                        isVaild = true;
                        break;
                    }
                }

            }
            if (!stack.isEmpty()) isVaild = false;
            if (isVaild) answer++;
        }
        return answer;
    }
}