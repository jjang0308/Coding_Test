import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        int total = 0;
        for(int work : works){
            total += work;
        }
        if(total<n)
            return 0;
        
        PriorityQueue<Integer>q = new PriorityQueue<>(Collections.reverseOrder());
        for(int work : works){
            q.add(work);
        }
        for(int i =0; i<n; i++){
            int maxWork = q.poll();
            maxWork--;
            q.add(maxWork);
        }
        while(!q.isEmpty()){
            int work = q.poll();
            answer += (long)(work * work);
        }
        
        return answer;
    }
}