import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer>map = new HashMap<>();
       for(String[]items : clothes){
           map.put(items[1], map.getOrDefault(items[1],0)+1);
       }
        int answer = 1;
        for(int count : map.values()){
            answer *= (count + 1);
        }
        return answer - 1;
    }
}