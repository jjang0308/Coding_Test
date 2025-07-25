import java.util.*;
class Solution {
    Set<Integer> primeSet;
    public int solution(String numbers) {
        primeSet = new HashSet<>();
        boolean[]visited = new boolean[numbers.length()];
        dfs(numbers, visited, "");
        return primeSet.size();
    }
    
    void dfs(String numbers, boolean[]visited, String cur){
        if(cur.length() != 0){
            if(isPrime(Integer.parseInt(cur))) primeSet.add(Integer.parseInt(cur));
        }
        for(int i = 0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(numbers, visited, cur + numbers.charAt(i));
                visited[i] = false;
            }
        }
    }
    
    boolean isPrime(int num){
        if(num < 2) return false;
        for(int i =2; i<num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}