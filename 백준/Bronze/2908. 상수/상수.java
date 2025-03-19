import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
            //int 2개 입력 받고
            int a = sc.nextInt();
            int b = sc.nextInt();
            //역으로 변환
            a = reverse(a);
            b = reverse(b);
            //두개 비교 큰 거 출력
            if(a>b)
                System.out.println(a);
            else
                System.out.println(b);
    }
    public static int reverse(int x){
        int rev = 0;
        while(x!=0){
            rev = rev*10 + x%10;
            x/=10;
        }
        return rev;
    }
}

