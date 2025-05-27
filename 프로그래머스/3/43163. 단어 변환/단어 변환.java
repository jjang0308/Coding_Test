import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        Queue<Word>q = new LinkedList<>();
        boolean[]visited = new boolean[words.length];
        q.add(new Word(0, begin));
        
        while(!q.isEmpty()){
            Word cur = q.remove();
            if(cur.word.equals(target)) return cur.count;
            for(int i = 0; i<words.length; i++){
                if(!visited[i] && countDiffCount(cur.word, words[i])==1){
                    visited[i] =true;
                    q.add(new Word(cur.count+1, words[i]));
                }
            }
        
        }
        return 0;    
    }
    
    int countDiffCount(String word, String target){
        int diffCount = 0;
        for(int i =0; i<word.length(); i++){
            if(word.charAt(i) != target.charAt(i)) diffCount++;
        }
        return diffCount;
    }
    
    class Word{
        int count;
        String word;
        
        public Word(int count, String word){
            this.count = count;
            this.word = word;
        }
    }
}