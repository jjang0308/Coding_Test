import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result1 = a*(b%10); // 123 * 123 => 123 * 3
        int result2 = (a*(b%100 - b%10))/10; // 123 * 123 => 123 * 20
        int result3 = (a*(b-b%100))/100; // 123 * 123 => 123 * 100
        int result4 = a*b;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}