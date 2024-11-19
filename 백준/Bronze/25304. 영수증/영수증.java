import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        int result2 = 0;
        int num = scanner.nextInt();
        int []buf = new int[num];
        for(int i = 0; i<num; i++){
            int price = scanner.nextInt();
            int ea = scanner.nextInt();
            buf[i] = price * ea;
            result2 += buf[i];
        }
        if(result2 == result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}