import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[]buf = new int[num];
        for(int i = 0; i < num; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            buf[i] = a + b;
        }
        for(int i = 0; i < num; i++) {
            System.out.println(buf[i]);
        }
    }
}