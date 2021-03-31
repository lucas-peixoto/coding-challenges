import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoyOrGirl {

    public static void bog(String input) {
        long charsCount = input.chars()
                .distinct()
                .count();

        String output = "IGNORE HIM!";

        if ((charsCount % 2) == 0)
            output = "CHAT WITH HER!";

        System.out.println(output);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        bog(input);
    }
}
