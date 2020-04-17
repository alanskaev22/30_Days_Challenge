package hackerRank;

public class Recursion_Day9 {
    /**
     Write a factorial function that takes a positive integer,  as a parameter and prints the result of factorial.
     */

    public static void main(String[] args) {

        System.out.println(factorial(4));

    }

    public static int factorial(int n) {
        int ans = n;


        while (n > 1) {
            n--;
            ans = ans * n;
            factorial(n);
        }
        return ans;
    }
}
