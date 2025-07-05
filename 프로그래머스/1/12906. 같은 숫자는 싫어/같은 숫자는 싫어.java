import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer>stack = new Stack<>();
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            if(stack.isEmpty()){
                stack.add(arr[i]);
            }else if(stack.peek() != arr[i]){
                stack.add(arr[i]);
            }
        }
        int[]a = new int[stack.size()];
        for(int i = stack.size() - 1; i>=0; i--){
            a[i] = stack.pop();
        }
        
        return a;
    }
}