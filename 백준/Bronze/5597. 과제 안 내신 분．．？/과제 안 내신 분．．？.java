import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = new int[30];
        int index1 = 0;

        for (int i = 0; i < 28; i++) {
            int num = scanner.nextInt();
            arr[num-1] = num;   // 1 ~ 30사이 28개 들어감
        }
        for(int i = 0; i < 30; i++){  // 1~30번 비교해서 0인 인덱스값 찾기
            if(arr[i] == 0){
                index1 = i;
                System.out.print(index1+1+" ");
            }
        }

    }
}