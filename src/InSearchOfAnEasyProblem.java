import java.util.Scanner;

public class InSearchOfAnEasyProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numEntries = scanner.nextLine();
        String entries = scanner.nextLine();

        System.out.println(entries.contains("1") ? "HARD" : "EASY");
    }
}
