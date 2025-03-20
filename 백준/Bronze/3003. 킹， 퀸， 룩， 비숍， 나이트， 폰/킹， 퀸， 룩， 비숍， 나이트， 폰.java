import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // 1 1 2 2 2 8
        // arr[i] - inputArr[i]
        // 0 1 2 2 2 7
        // 1 0 0 0 0 1
        int []oldarr = new int[6];
        int []arr = {1,1,2,2,2,8};
        int []newarr = new int[6];

        for (int i = 0; i < 6; i++) {
            oldarr[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            newarr[i] = arr[i] - oldarr[i];
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(newarr[i]+" ");
        }
    }
}