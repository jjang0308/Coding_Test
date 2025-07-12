import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character>stack = new Stack<>();
        for(char c : s.toCharArray()){
           if(stack.isEmpty()){
               if(c == '('){
                   stack.push(c);
               }else{
                   return false;
               }
           }else{
               if(c == '('){
                   stack.push(c);
               }else{
                   stack.pop();
               }
           }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
}