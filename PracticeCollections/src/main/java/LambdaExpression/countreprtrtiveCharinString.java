package LambdaExpression;

/**
 * Convert the string into character stream
 * Check if the character in the stream is the character to be counted using filter() function.
 * Count the matched characters using the count() function
 *
 *
 * */

public class countreprtrtiveCharinString {
    public static void main(String[] args) {

        String s = "abcaabbcaadd";
        System.out.println("Occurence of 'a' in given String " +s +"is: "  +countChar(s,'a'));

    }

    public static long countChar(String str, char ch){

        return str.chars().filter(c-> c==ch).count();
    }
}
