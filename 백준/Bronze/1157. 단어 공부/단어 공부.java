import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> countMap = new HashMap<>();

        String input = br.readLine().toUpperCase(); // 입력을 대문자로 변환

        // 문자 카운트
        for (char c : input.toUpperCase().toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // 가장 높은 카운트를 찾기
        int maxCount = 0;
        char maxChar = '?';
        boolean isDuplicate = false;

        for (char c : countMap.keySet()) {
            int count = countMap.get(c);
            if (count > maxCount) {
                maxCount = count;
                maxChar = c;
                isDuplicate = false; // 새로운 최대값 발견
            } else if (count == maxCount) {
                isDuplicate = true; // 중복 발견
            }
        }

        // 결과 출력
        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println(maxChar);
        }
    }
}
