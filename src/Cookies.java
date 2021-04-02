// https://codeforces.com/problemset/problem/129/A

import java.util.Arrays;
import java.util.Scanner;

public class Cookies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBags = scanner.nextInt();
        int[] bags = new int[numBags];

        for (int i = 0; i < numBags; i++) {
            bags[i] = scanner.nextInt();
        }

        int totalCookies = Arrays.stream(bags).sum();
        int possibilities = 0;

        for (int i = 0; i < numBags; i++) {
            if ((totalCookies - bags[i]) % 2 == 0) possibilities++;
        }

        System.out.println(possibilities);
    }
}
