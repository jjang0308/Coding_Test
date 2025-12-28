import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String>set = new HashSet<>();
        Arrays.sort(phone_book);
        for(String p : phone_book){
            for(int i = 0; i<p.length(); i++){
                String a = p.substring(0,i);
                if(set.contains(a)) return false;
            }
            set.add(p);
        }
        return answer;
    }
}