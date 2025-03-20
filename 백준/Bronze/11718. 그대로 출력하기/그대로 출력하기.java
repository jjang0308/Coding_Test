import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        String input;
        while((input = br.readLine()) != null && !input.isEmpty()) {
            output.append(input).append("\n");
        }
        System.out.print(output.toString());
    }
}