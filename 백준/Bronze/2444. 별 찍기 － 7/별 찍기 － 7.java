import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            // 4 3 2 1 0
            for (int j = 0; j < num-i-1; j++) {
                System.out.print(" ");
            }// 1 3 5 7 9
//            i*2+1
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < num-1; i++) {
            // 1 2 3 4
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            // 0
            // 7 5 3 1
            for (int j = 0; j < num*2-2*i-3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}