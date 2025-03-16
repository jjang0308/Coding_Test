import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[]s = new String[num];
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            String line = br.readLine(); // 한 줄을 읽습니다.
            String[] parts = line.split(" "); // 공백으로 나눕니다.
            a[i] = Integer.parseInt(parts[0]); // 첫 번째 부분을 정수로 변환
            s[i] = parts[1];
        }
        // 0 -> 3       1-> 5
        // 0 -> ABC     1-> /HTP

        for(int k = 0; k < num; k++){
            for (int i = 0; i < s[k].length(); i++) {
                for (int j = 0; j < a[k]; j++) {
                    System.out.print(s[k].charAt(i));
                }
            }
            System.out.println();
        }

    }
}

