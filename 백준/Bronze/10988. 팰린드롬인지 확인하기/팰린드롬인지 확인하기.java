import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuffer sb = new StringBuffer(word);
        sb.reverse();
        if(sb.toString().equals(word))
            System.out.println("1");
        else
            System.out.println("0");
  }
}