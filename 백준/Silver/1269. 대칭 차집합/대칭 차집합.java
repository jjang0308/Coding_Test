import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        String[] part = br.readLine().split(" ");
        int n = Integer.parseInt(part[0]);
        int m = Integer.parseInt(part[1]);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        String[] part1 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(part1[i]);
            set1.add(num);
        }
        String[] part2 = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(part2[i]);
            set2.add(num);
        }
        Set<Integer> temp1 = new HashSet<>(set1);
        temp1.removeAll(set2);
        Set<Integer> temp2 = new HashSet<>(set2);
        temp2.removeAll(set1);
        System.out.println(temp1.size()+temp2.size());
    }
}
