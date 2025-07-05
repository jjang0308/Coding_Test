import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer>map = new HashMap<>();
        for(String[]c : clothes){
            map.put(c[1] , map.getOrDefault(c[1], 0) + 1);
        }
        int answer = 1;
        // headgear : 2 + 아무것도 안 입음 1 = 3
        // eyewear : 1 + 아무것도 안 입음 1 = 2
        // 아무것도 안 입음 , 아무것도 안 입음 -> x 이므로 answer - 1
        
        for(int count : map.values()){
            answer *= (count + 1);
        }
        return answer -1;
    }
}

