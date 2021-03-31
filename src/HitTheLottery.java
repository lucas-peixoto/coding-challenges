import java.util.Scanner;

public class HitTheLottery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] availableBills = {100, 20, 10, 5, 1};
        int withdraw = scanner.nextInt();
        int billsCount = 0;

        for (int bill : availableBills) {
            billsCount += withdraw / bill;
            withdraw %= bill;
        }

        System.out.println(billsCount);
    }
}
