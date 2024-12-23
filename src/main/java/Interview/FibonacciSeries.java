package Interview;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int lengthFib;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fibonacci Length Required");
        lengthFib = scan.nextInt();
        int[] fib = new int[lengthFib];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i< lengthFib; i++) {
            fib[i]= fib[i-1]+fib[i-2];
        }
        System.out.println("Fibonacci Series:");
        for (int i = 0; i< lengthFib; i++) {
            System.out.println(fib[i]);
        }
    }
}
