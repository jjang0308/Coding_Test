import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basket = scanner.nextInt();
        int trial = scanner.nextInt();
        int temp = 0;
        int []arr = new int[basket];
        for (int i = 0; i < basket; i++) {
            arr[i] = i+1;  
        }
        for(int i = 0; i<trial; i++){
           int index1 = scanner.nextInt()-1;  
           int index2 = scanner.nextInt()-1;   
            temp = arr[index1];                   
            arr[index1] = arr[index2];        
            arr[index2] = temp;          
        }
        for(int i = 0; i<basket; i++){
            System.out.print(arr[i]+" ");
        }
    }
}