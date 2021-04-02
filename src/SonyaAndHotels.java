// https://codeforces.com/problemset/problem/1004/A

import java.util.Scanner;

public class SonyaAndHotels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numHotels = scanner.nextInt();
        int distance = scanner.nextInt();

        int[] hotelsCoords = new int[numHotels];
        int newHotels = 2;

        for (int i = 0; i < numHotels; i++) {
            hotelsCoords[i] = scanner.nextInt();

            if (i > 0) {
                if ((hotelsCoords[i] - hotelsCoords[i - 1]) == (2 * distance))
                    newHotels += 1;
                else if ((hotelsCoords[i] - hotelsCoords[i - 1]) > (2 * distance))
                    newHotels += 2;
            }
        }

        System.out.println(newHotels);
        scanner.close();
    }
}
