package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryNums_Day10 {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        System.out.println(convertToBinary(n));
        System.out.println(consecutiveOnes(convertToBinary(n)));


    }

    static List<Integer> convertToBinary(int n) {
        List<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 2);
            n /= 2;
        }
        return list;
    }

    static Integer consecutiveOnes(List<Integer> list) {
        int max = 0;
        int counter = 1;

        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i) == 1 && list.get(i) == list.get(i + 1)) {
                counter += 1;
            } else counter = 1;

            if (max <= counter) max = counter;
        }
        return max;
    }

}
