public class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        // 키패드 좌표 (행, 열)
        int[][] keypad = {
            {3, 1}, // 0 위치 (행 3, 열 1)
            {0, 0}, // 1
            {0, 1}, // 2
            {0, 2}, // 3
            {1, 0}, // 4
            {1, 1}, // 5
            {1, 2}, // 6
            {2, 0}, // 7
            {2, 1}, // 8
            {2, 2}  // 9
        };

        // 시작 위치: 왼손 '*', 오른손 '#'
        int[] leftPos = {3, 0};  // '*' 위치 (행 3, 열 0)
        int[] rightPos = {3, 2}; // '#' 위치 (행 3, 열 2)

        for (int num : numbers) {
            // 왼쪽 열 번호: 1,4,7
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                leftPos = keypad[num];
            }
            // 오른쪽 열 번호: 3,6,9
            else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                rightPos = keypad[num];
            }
            // 가운데 열 번호: 2,5,8,0
            else {
                int leftDist = distance(leftPos, keypad[num]);
                int rightDist = distance(rightPos, keypad[num]);

                if (leftDist < rightDist) {
                    answer.append("L");
                    leftPos = keypad[num];
                } else if (rightDist < leftDist) {
                    answer.append("R");
                    rightPos = keypad[num];
                } else {
                    // 거리가 같으면 손잡이에 따라 결정
                    if (hand.equals("right")) {
                        answer.append("R");
                        rightPos = keypad[num];
                    } else {
                        answer.append("L");
                        leftPos = keypad[num];
                    }
                }
            }
        }
        return answer.toString();
    }

    // 맨해튼 거리 계산
    private int distance(int[] pos1, int[] pos2) {
        return Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]);
    }
}
