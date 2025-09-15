class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int a : num_list){
            if(a%2 == 0){
                sb2.append(a);
            }else{
                sb.append(a);
            }
        }
        answer = Integer.parseInt(sb.toString()) + Integer.parseInt(sb2.toString());
        return answer;
    }
}