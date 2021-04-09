// https://codeforces.com/problemset/problem/1267/B

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BallsOfBuma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String balls = scanner.next();
        scanner.close();

        List<String> layers = new ArrayList<>();
        int moves = 0;

        while (balls.length() > 1) {
            String letter = String.valueOf(balls.charAt(0));

            if (balls.equals(letter.repeat(balls.length()))) {
                moves = balls.length() + 1;
                balls = "";
            } else if (balls.endsWith(letter + letter) || (balls.startsWith(letter + letter) && balls.endsWith(letter))) {
                balls = balls
                        .replaceFirst(letter + "+", "")
                        .replaceAll(letter + "+$", "");

            } else {
                break;
            }
        }

        System.out.println(moves);
    }
}
