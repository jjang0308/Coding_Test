class Solution {
    public String solution(String s) {
        String answer = "";
        String[]tokens = s.split(" ");
        int min = Integer.parseInt(tokens[0]);
        int max = Integer.parseInt(tokens[0]);
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<tokens.length; i++){
            if(min > Integer.parseInt(tokens[i])){
                min = Integer.parseInt(tokens[i]);
            }
        }
        for(int i = 0; i<tokens.length; i++){
            if(max < Integer.parseInt(tokens[i])){
                max = Integer.parseInt(tokens[i]);
            }
        }
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        
        return sb.toString();
    }
}