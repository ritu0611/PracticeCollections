package Interview;

import java.util.Arrays;
import java.util.Locale;

public class checkAnagramString {
    public static void main(String[] args) {

        isAnagram("keep","peek");
        isAnagram("Rob","Bob");
        isAnagram("Grow","ROw");


    }

    public static void isAnagram(String s1, String s2){

        boolean status = true; // initially setting it as true
        String input1 = s1.replaceAll("\\s","").toLowerCase();
        String input2 = s2.replaceAll("\\s","").toLowerCase();

        if(input1.length()!=input2.length()){

            status = false;
        }

        else {

            char[] input1ToArray = input1.toCharArray();
            char[] input2ToArray = input2.toCharArray();

            Arrays.sort(input1ToArray);
            Arrays.sort(input2ToArray);

            status = Arrays.equals(input1ToArray,input2ToArray);

        }

        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
}
