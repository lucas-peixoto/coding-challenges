import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FastFoodRestaurant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rounds = scanner.nextInt();

        for (int i = 0; i < rounds; i++) {
            System.out.println(countMaxDishes(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
    }

    static int countMaxDishes(int a, int b, int c) {
        String entry = Stream.of(a, b, c)
                .map(n -> Math.min(n, 4))
                .map(String::valueOf)
                .sorted()
                .collect(Collectors.joining());
        int entryInt = Integer.parseInt(entry);

        if (entry.equals("000")) return 0;
        if (entry.startsWith("00")) return 1;
        if (entry.startsWith("01")) return 2;
        if (entry.startsWith("0") || entry.startsWith("11")) return 3;
        if (entryInt >= 122 && entryInt <= 222) return 4;
        if (entryInt >= 223 && entryInt <= 244) return 5;
        if (entry.startsWith("3")) return 6;
        return 7;
    }
}
