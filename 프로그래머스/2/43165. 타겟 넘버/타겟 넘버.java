class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        
        // 현재 숫자를 더하거나 빼는 두 가지 경우를 모두 시도
        int plus = dfs(numbers, target, depth + 1, sum + numbers[depth]);
        int minus = dfs(numbers, target, depth + 1, sum - numbers[depth]);
        
        return plus + minus;
    }
}