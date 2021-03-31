import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class BeautifulMatrix {
    public static void main(String[] args) throws IOException {
        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String line = reader.readLine().trim();

            matrix.add(
                    Arrays.stream(line.split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
            );
        }

        long startTime = System.nanoTime();
        int moves = calcMoves(matrix);
        long stopTime = System.nanoTime();

        System.out.println("Número de movimentos: " + moves);
        System.out.println("Tempo de execução: " + (stopTime - startTime) + "ns");
    }

    private static int calcMoves(List<List<Integer>> matrix) {
        int[] oneCoord = new int[2];

        for (int i = 0; i < matrix.size(); i++) {
            int pos = matrix.get(i).indexOf(1);

            if (pos > -1) {
                oneCoord = new int[] {i, pos};
                break;
            }
        }

        int yMoves = Math.abs(oneCoord[0] - 2);
        int xMoves = Math.abs(oneCoord[1] - 2);

        System.out.printf("coord: (%d, %d)\n", oneCoord[0], oneCoord[1]);

        return xMoves + yMoves;
    }
}
