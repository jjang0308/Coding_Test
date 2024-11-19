import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int []arr = new int[num];
        int []arr1 = new int[num];
        int []arr2 = new int[num];
        for(int i = 0; i<num; i++){
            int a =scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a+b;
            arr1[i] = a;
            arr2[i] = b;
        }
        for(int i = 0; i<num; i++){
            System.out.println("Case #"+(i+1)+": "+arr1[i]+" + "+arr2[i]+" = "+arr[i]);
        }
    }
}