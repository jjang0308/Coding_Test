import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] alpha = new int[26]; // 알파벳 개수는 26개
        for (int i = 0; i < 26; i++) {
            alpha[i] = -1; // 초기값 -1 설정
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 알파벳인지 확인
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a'; // 알파벳의 인덱스 계산
                if (alpha[index] == -1) { // 첫 등장일 경우에만 인덱스 저장
                    alpha[index] = i;
                }
            }
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.print(alpha[i] + " ");
        }
    }
}