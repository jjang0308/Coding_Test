
class Solution {
    
    public int diff(int a, int b){
        if(a == b)
            return 0;
        else
            return 1;
    }
    
    public int solution(int a, int b, int c) {
        int answer = 0;
        int diffCount = 0;
        if(diff(a,b)+diff(b,c)+diff(a,c) == 0){
            return (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }else if(diff(a,b)+diff(b,c)+diff(a,c) == 2){
            return (a+b+c) * (a*a+b*b+c*c);
        }else{
            return a+b+c;
        }
    }
}