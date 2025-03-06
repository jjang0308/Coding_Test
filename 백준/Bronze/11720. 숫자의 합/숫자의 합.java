import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int a=0;
        for (int i = 0; i < n; i++) {
            int value = str.charAt(i) - '0';
            a+=value;
        }
        System.out.print(a);
    }
}