package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arr2D_Hourglass_Day11 {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(countHourGlass(arr));
        scanner.close();
    }

    static int countHourGlass(int[][] arr) {
        List<Integer> hourGlass = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = 0; j < arr[i].length - 2; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                hourGlass.add(sum);
            }
        }
        return hourGlass.stream().max((o1, o2) -> o1.compareTo(o2)).get();
    }
}

