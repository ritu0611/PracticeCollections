package basics;

import javax.swing.text.html.parser.Entity;
import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
     char c ='a';
     char b='z';
        System.out.println("Given character is:" +isVowel(c));
        System.out.println("Given character is:" +isVowel(b));
    }
    public static String isVowel(char ch){
        String str = "aeiouAEIOU";
        return (str.indexOf(ch) != -1 ? "Vowel":"Consonant");
    }
}
