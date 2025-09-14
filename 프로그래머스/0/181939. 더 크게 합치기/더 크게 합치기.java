class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b);
        sb2.append(a);
        if(Integer.parseInt(sb.toString()) < Integer.parseInt(sb2.toString())){
            return Integer.parseInt(sb2.toString());
        }
        return Integer.parseInt(sb.toString());
    }
}