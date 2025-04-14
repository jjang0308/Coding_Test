class Solution {
    public int solution(int[][] arr) {
    int n = arr.length; // 배열의 크기 n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) { // 대칭 조건 확인
                    return 0; // 대칭이 아닐 경우 0 반환
                }
            }
        }
        return 1; 
}
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] arr1 = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        int[][] arr2 = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723},                           {587, 754, 723, 81}};

        System.out.println(sol.solution(arr1)); // 출력: 1
        System.out.println(sol.solution(arr2)); // 출력: 0
    }
}