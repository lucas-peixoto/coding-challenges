import java.util.Scanner;

public class Dubstep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dubstep = scanner.next();

        String original = dubstep
                .replaceAll("WUB", " ")
                .replaceAll("  +", " ")
                .trim();

        System.out.println(original);
    }
}
