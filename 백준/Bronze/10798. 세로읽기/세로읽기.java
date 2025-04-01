import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = new String[5];
        // 사용자 입력 배열에 저장
        for (int i = 0; i < 5; i++) {
            lines[i] = br.readLine();
        }
        StringBuilder result = new StringBuilder();
        int maxLen = 0;
        for (String line : lines) {
            maxLen = Math.max(maxLen, line.length());
        }
        // 각 열별로 문자 조합
        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < lines[j].length()) {
                    result.append(lines[j].charAt(i));
                }
            }
        }
        System.out.println(result.toString());
    }
}
