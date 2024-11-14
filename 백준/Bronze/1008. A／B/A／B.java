import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b =scanner.nextInt();
        double result = (double) a/(double) b;
        System.out.println(result);
    }
}