import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = new int[9];
        int max = arr[0];
        int maxIndex = 0;
        for(int i = 0; i < 9; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < 9; i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}