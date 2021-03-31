import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (b > a) {
                System.out.println(b - a);
                return;
            }

            int diff = (a + b) % b;

            if (diff == 0) {
                System.out.println(0);
            } else {
                int result = b - diff;
                System.out.println(result);
            }
        }
    }
}
