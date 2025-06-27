import java.util.*;

public class Solution {
    
    class Word{
        String name;
        int count;
        
        Word(String name, int count){
            this.name = name;
            this.count = count;
        }
    }
    
    int diffCount(String name, String target){
        int count = 0;
        for(int i = 0; i<name.length(); i++){
            if(name.charAt(i) != target.charAt(i)){
                count++;
            }
        }
        return count;
    }
    
    
     public int solution(String begin, String target, String[] words) {
         Queue<Word>q = new LinkedList<>();
         boolean[]visited = new boolean[words.length];
         q.offer(new Word(begin,0));
         // visited[be] = true;
         while(!q.isEmpty()){
             Word cur = q.poll();
             if(cur.name.equals(target)) return cur.count;
             for(int i = 0; i<words.length; i++){
                  if(!visited[i] && diffCount(cur.name, words[i]) == 1){
                      q.offer(new Word(words[i], cur.count+1));
                      visited[i] = true;
                  }
             }
         }
         return 0;
    }
}