import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int totalTime = 0;

        for (char c : input.toCharArray()) {
            int dialNumber = getDialNumber(c);
            totalTime += (dialNumber + 1); 
        }
        System.out.println(totalTime);
    }

    private static int getDialNumber(char c) {
        if (c >= 'A' && c <= 'C') {
            return 2; 
        } else if (c >= 'D' && c <= 'F') {
            return 3;
        } else if (c >= 'G' && c <= 'I') {
            return 4;
        } else if (c >= 'J' && c <= 'L') {
            return 5;
        } else if (c >= 'M' && c <= 'O') {
            return 6;
        } else if (c >= 'P' && c <= 'S') {
            return 7;
        } else if (c >= 'T' && c <= 'V') {
            return 8;
        } else if (c >= 'W' && c <= 'Z') {
            return 9;
        }
        return 0;
    }
}
