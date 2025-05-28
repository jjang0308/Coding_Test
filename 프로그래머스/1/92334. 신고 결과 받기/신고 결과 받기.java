import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String , List<String>>map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(String s : report){
            set.add(s);
        }
        for(String s: set){
            String[]parts = s.split(" ");
            String send = parts[0];
            String get = parts[1];
            map1.putIfAbsent(parts[0],new ArrayList<>());
            map1.get(parts[0]).add(parts[1]);
        }
        for(String key: map1.keySet()){
            List<String>value = map1.get(key);
            for(String s : value){
                 map2.put(s, map2.getOrDefault(s , 0)+1);
            }
        }
        
        for(int i = 0; i < id_list.length; i++){
            String s = id_list[i];
            for(String s2: map1.getOrDefault(s, new ArrayList<>())){
                if(map2.get(s2) >= k){
                    answer[i] += 1;
                }
            }
        }
        
        return answer;
    }
}