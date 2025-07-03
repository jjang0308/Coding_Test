class Solution {
    public int solution(int[] numbers, int target) {
     return dfs(numbers, target, 0, 0);
    }
    public int dfs(int[] numbers, int target, int cur, int index){
        if(index == numbers.length) return(cur == target) ? 1:0;
        int sum = 0;
        sum += dfs(numbers, target , cur+ numbers[index], index+1);
        sum += dfs(numbers, target, cur-numbers[index], index+1);
        return sum;
    }
}