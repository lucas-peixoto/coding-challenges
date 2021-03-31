import java.util.Scanner;

public class MishkaAndGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rounds = scanner.nextInt();
        int mishkaPoints = 0;
//        int chrisPoints = 0;

        for (int i = 0; i < rounds; i++) {
            int mishkaDice = scanner.nextInt();
            int chrisDice = scanner.nextInt();

            mishkaPoints += Integer.compare(mishkaDice, chrisDice);

//            if (mishkaDice == chrisDice) continue;
//
//            if (mishkaDice > chrisDice) {
//                mishkaPoints++;
//            } else {
//                chrisPoints++;
//            }
        }

        if (mishkaPoints == 0) {
            System.out.println("Friendship is magic!^^");
        } else if (mishkaPoints > 0) {
            System.out.println("Mishka");
        } else {
            System.out.println("Chris");
        }

//        if (mishkaPoints == chrisPoints) {
//            System.out.println("Friendship is magic!^^");
//        } else {
//            System.out.println((mishkaPoints > chrisPoints) ? "Mishka" : "Chris");
//        }
    }
}
