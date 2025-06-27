import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int count = 0;
        boolean[]visited = new boolean[n];
        for(int i =0; i<n; i++){
            if(!visited[i]){
                bfs(n, computers, visited, i);
                count++;
            }
        }
        return count;
    }
    
    void bfs(int n, int[][] computers, boolean[]visited, int cur){
        Queue<Integer>q = new LinkedList<>();
        q.offer(cur);
        visited[cur] = true;
        while(!q.isEmpty()){
            int start = q.poll();
            for(int i =0; i<n; i++){
                if(computers[start][i] == 1 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}