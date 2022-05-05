import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();
        System.out.println("Enter any number");
        int b = sc.nextInt();
        for (int num = a; num <= b; num++) {
            if (isPrime(num - 2) && isPrime(num) && isPrime(num + 2)) {
                System.out.println((num - 2) + " , " + num + " , " + (num + 2) + " are Prime Triplets");
            } else if (isPrime(num - 1) && isPrime(num) && isPrime(num + 2)) {
                System.out.println((num - 1) + " , " + num + " , " + (num + 2) + " are Prime Triplets");
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        boolean prime = true;
        for (int x = 2; x <= n / 2; x++) {
            if (n % x == 0) {
                prime = false;
            }
        }
        return prime;
    }
}