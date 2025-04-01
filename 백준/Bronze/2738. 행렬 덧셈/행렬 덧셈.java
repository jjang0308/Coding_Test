import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int[][] num1 = new int[a][b];
        int[][] num2 = new int[a][b];
        int [][] num3 = new int[a][b];
        for (int i = 0; i < a; i++) {
                String []str1 = br.readLine().split(" ");
            for (int j = 0; j < b; j++) {
                num1[i][j] = Integer.parseInt(str1[j]);
            }
        }for (int i = 0; i < a; i++) {
                String []str1 = br.readLine().split(" ");
            for (int j = 0; j < b; j++) {
                num2[i][j] = Integer.parseInt(str1[j]);
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                num3[i][j] = num1[i][j] + num2[i][j];
            }
        }for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(num3[i][j]+" ");
            }
            System.out.println();
        }

    }
}

