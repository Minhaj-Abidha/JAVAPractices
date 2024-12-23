package Interview;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String inputString = scan.next();
        StringBuilder revresedString= new StringBuilder();
        for(int i=inputString.length()-1;i>=0;i--){
            revresedString.append(inputString.charAt(i));
        }
        System.out.println("Reversed String: "+revresedString);
    }
}