package Interview;

public class Amstrong {
    public static void main(String[] args) {

        //int input = 371;
        /*int actualnum = input;
        double result = 0;*/

       /* while (actualnum != 0) {
            int n = actualnum % 10;
            result = result + Math.pow(n, 3);
            actualnum = actualnum / 10;
        }

        if (result == input) {
            System.out.println(input + " is an Armstrong number");
        } else {
            System.out.println(input + " is not an Armstrong number");
        }*/
        String input = "371";
        int amstrongOutput = 0;
        for(int i = 0; i< input.length(); i++) {
            amstrongOutput = amstrongOutput +(int) Math.pow(Integer.parseInt(String.valueOf(input.charAt(i))), input.length());
        }
        System.out.println(amstrongOutput);
    }
}
