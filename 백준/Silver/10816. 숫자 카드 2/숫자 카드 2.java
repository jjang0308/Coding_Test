import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        String[] part = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(part[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int n2 = Integer.parseInt(br.readLine());
        String[] part2 = br.readLine().split(" ");
        for (int i = 0; i < n2; i++) {
            int query = Integer.parseInt(part2[i]);
            sb.append(map.getOrDefault(query, 0)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
