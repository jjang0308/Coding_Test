import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine(); // 한 줄을 읽습니다.
            String[] parts = line.split(" "); // 공백으로 나눕니다.
            parts = Arrays.stream(parts)
                .filter(item -> !item.equals(""))
                .toArray(String[]::new);
            System.out.println(parts.length);
    }
}

