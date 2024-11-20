import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        int []arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < num; i++){
            if(arr[i] < num2){
                System.out.print(arr[i]+" ");
            }
        }
    }
}