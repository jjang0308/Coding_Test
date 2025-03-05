import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();  // **********줄바꿈 문자 소비********* [오답노트] 이거 없으면 ArrayBoundException 터짐
        String[]a = new String[n]; //3개짜리 문자열 배열
        for(int i = 0; i<n; i++){ // 3번 반복
            char[]arr =  scanner.nextLine().toCharArray(); //문자 배열 생성 후 입력받음
            if(arr.length <= 1){ //문자 배열 길이가 1이하면 하나짜리 두개 를 문자열 배열에 대입
                a[i] = arr[0]+""+arr[0];
            }else
                a[i] = arr[0]+""+arr[arr.length-1];
        }
        for(int i = 0; i<n; i++){
            System.out.println(a[i]);
        }
  }
}