import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = new int[10];
        int weight = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        //정렬(버블 정렬)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if ((arr[j] % 42) > (arr[j + 1] % 42)) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length-1; i++){
           if(arr[i]%42 != arr[i+1]%42){
               weight++;
           }
        }
        System.out.println(weight+1);
    }
}