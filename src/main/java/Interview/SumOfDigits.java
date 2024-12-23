package Interview;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class SumOfDigits {
    public static int getSumOfAllDigits(int num) {

// Declare variable sum which will store the sum of all digits.
        int sum = 0;

// Run a while loop until the num becomes 0.
        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input value:");
        String input = scan.next();

        //Method1 - Using Parse
        AtomicInteger sumOfDigits = new AtomicInteger();
        IntStream.range(0,input.length()).forEach(i->
                sumOfDigits.set(sumOfDigits.get() + Integer.parseInt(String.valueOf(input.charAt(i)))));
        System.out.println("Sum of digits:"+sumOfDigits);

        //Method 2 - Using math
        System.out.println(getSumOfAllDigits(549));
    }
}
