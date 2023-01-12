package LambdaExpression;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

interface MyInterface{

    String reverseWord(String str);
}

public class reverseWordandremovespaces {
    public static void main(String[] args) {

        /*System.out.println("Enter the String with spaces");
        Scanner sc = new Scanner(System.in);*/
        String input = "Hi I am Ritu";

        MyInterface ref = s -> {
            String[] splitString = s.split(" ");
            String output = "";
            for(int i = splitString.length-1; i>=0; i--){

                output = output + splitString[i] + " ";
            }
            return output.replaceAll(" ","");
        };


        //output: RituamIHi
        System.out.println("String with reversed words and no spaces: " + ref.reverseWord(input));


        System.out.println("======================================================");

        // Output is : I evoL aidnI
        reverSeWords("I Love India");
    }

    public static void reverSeWords(String str){

        String[] words = str.split(" ");
        StringBuilder strBuilder = new StringBuilder();
        Stream<String> stream = Arrays.stream(words);
        stream.forEach( s -> {

            Function<String,String> reverse = k -> new StringBuilder(k).reverse().toString();
            String reversedWord = reverse.apply(s);
            strBuilder.append(reversedWord + " ");
                }
        );

        System.out.println("Original String is " +str);
        System.out.println("Reversed String is " +strBuilder);
    }

}
