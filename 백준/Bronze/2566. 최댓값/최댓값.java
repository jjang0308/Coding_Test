import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] a = new int[9][9];
        for (int i = 0; i < 9; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                a[i][j] = Integer.parseInt(input[j]);
            }
        }
        int big = a[0][0];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] >= big) {
                    big = a[i][j];
                }
            }
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == big) {
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(big);
        System.out.print(x+" "+y);
    }
}

