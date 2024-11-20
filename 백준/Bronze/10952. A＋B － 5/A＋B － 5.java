import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(;;){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if(num1==0 && num2==0){
                for (int i = 0; i < arr.size(); i++) {
                    System.out.println(arr.get(i));
                }
                break;
            }else{
                arr.add(num1+num2);
            }
        }
    }
}