import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basket = scanner.nextInt();
        int trial = scanner.nextInt();
        int []arr = new int[basket];
        for(int i =0; i < arr.length; i++){
            arr[i] = i+1;
        }
        for(int i = 0; i<trial; i++){
            int index1 = scanner.nextInt()-1;
            int index2 = scanner.nextInt()-1;
            for(int j = 0; j<=(index2-index1)/2; j++){
                int temp = arr[index1+j];
                arr[index1+j]=arr[index2-j];
                arr[index2-j]=temp;
            }
    }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
  }
}