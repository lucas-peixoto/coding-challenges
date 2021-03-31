import java.util.Scanner;

public class Hulk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int layers = scanner.nextInt();
        StringBuilder feelings = new StringBuilder("I hate ");

        for (int i = 1; i < layers; i++) {
            feelings.append((i % 2 == 0) ? "that I hate " : "that I love ");
        }

        System.out.println(feelings.append("it"));
    }
}
