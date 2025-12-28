import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]>q = new LinkedList<>();
        
        for(int i = 0; i<priorities.length; i++){
            q.add(new int[]{i, priorities[i]});
        }
        
        while(!q.isEmpty()){
            int[]cur = q.poll();
            int curIndex = cur[0];
            int curPriority = cur[1];
            boolean hasHigher = false;
            
            for(int[]p : q){
                if(p[1] > curPriority){
                    hasHigher = true;
                    break;
                }
            }
            
            if(hasHigher){
                q.add(cur);
            }else{
                answer++;
                if(curIndex == location){
                    return answer;
                }
            }
        }
        return answer;
    }
}