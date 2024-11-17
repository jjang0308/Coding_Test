import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

    if(h > 0) {
            if (m >= 45 && m <= 59) {
                System.out.print(h + " ");
                System.out.print(m - 45);
            } else if (m < 45) {
                System.out.print(h - 1 + " ");
                System.out.print(m + 15);
            }
    } else {
            if (m < 45) {
                System.out.print(h + 23 + " ");
                System.out.print(m + 15);
            }
            else if (m >= 45 && m <= 59) {
                System.out.print(h + " ");
                System.out.print(m - 45);
            }
        }
    }
}