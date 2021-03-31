import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WayTooLongWords {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numLines = Integer.parseInt(br.readLine());

        String input;
        String[] outputs = new String[numLines];

        for (int i = 0; i < numLines; i++) {
            input = br.readLine();
            outputs[i] = shorten(input);
        }

        Arrays.stream(outputs).forEach(System.out::println);
    }

    private static String shorten(String word) {
        if (word.length() > 10) {
            return word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
        } else {
            return word;
        }
    }
}
