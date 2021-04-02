// https://codeforces.com/problemset/problem/1095/B

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStabilization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        Integer[] arr = new Integer[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(Math.min(arr[length-2] - arr[0], arr[length-1] - arr[1]));
        scanner.close();
    }
}
