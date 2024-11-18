import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int time = scanner.nextInt();
        int remainHour = (m+time)/60; // 원래 시간 + 지나간 시간 : 140분 지나면 2시간 20분에서 2시간을 의미
        int remainMinute = (m+time)%60; // 원래 시간 + 지나간 시간 : 140분 지나면 2시간 20분 에서 20분을 의미

        if (h+remainHour < 24) {  //0~23
            if (m + time >= 60) { //60 이상
                System.out.print(h + remainHour + " ");
                System.out.print(remainMinute);
            } else {
                System.out.print(h+ " ");
                System.out.print(m + time);
            }
        }
        else { //24이상 이 될때
            if (m + time >= 60) {
                System.out.print((h + remainHour) - 24 + " ");
                System.out.print(remainMinute);
            } else {
                System.out.print(h + " ");
                System.out.print(remainMinute);
            }
        }
    }
}