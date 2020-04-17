package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOddLetters_Day6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();
        scan.nextLine();

    List<String> strList = new ArrayList<>();
        for(int i = 0; i < num; i++){
        strList.add(scan.next());
        scan.nextLine();
    }


        strList.forEach(o -> {
        oddChars(o);
        System.out.print("  ");
        evenChars(o);
        System.out.println("");
    });

}

    private static void evenChars(String string){
        char[] charArray = string.toCharArray();
        int i = 0;

        while (i <= charArray.length-1){
            System.out.print(charArray[i]);
            i+=2;
        }
    }

    private static void oddChars(String string){
        char[] charArray = string.toCharArray();
        int i = 1;
        while (i <= charArray.length-1){
            System.out.print(charArray[i]);
            i+=2;
        }
    }
}
