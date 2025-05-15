import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Set<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] part = br.readLine().split(" ");
            if (part[1].equals("enter")) {
                set.add(part[0]);
            } else {
                set.remove(part[0]);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        list.addAll(set);
        Collections.sort(list, Collections.reverseOrder());
        for (String left : list) System.out.println(left);
    }
}
