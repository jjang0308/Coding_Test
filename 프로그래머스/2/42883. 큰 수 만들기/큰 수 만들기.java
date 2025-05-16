import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int len = number.length();
        int len2 = len - k;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() < c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        for (int i = 0; i < len2; i++) {
            sb.append(stack.get(i));
        }
        return sb.toString();
    }
}