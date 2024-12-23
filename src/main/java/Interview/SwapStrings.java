package Interview;

import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {

// Take two string s1 and s2 which we need to swap.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st input");
        String s1 = scan.next();
        System.out.println("Enter 2nd input");
        String s2 = scan.next();

// Combine both the strings s1 and s2 using the concatenation(+) operator
        s1=s1+s2;

//Swapping Strings
s2 = s1.substring(0,s1.length()-s2.length());
s1= s1.substring(s2.length());
        System.out.println("S1 Output: "+s1);
        System.out.println("S2 Output: "+s2);
    }
}
