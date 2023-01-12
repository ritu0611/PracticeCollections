package Interview;

import java.nio.file.attribute.AclEntryType;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //1. reverse words in String
        String inputToChar[] = input.split(" ");
        String rev ="";

        for (int i= inputToChar.length-1;i>=0;i--){

            rev = rev + inputToChar[i] + " ";
        }

        System.out.println("Reversed word in String is: " +rev);

        // 2. reverse Charcter in String
        System.out.println("Reverse Character in String is : " +reverseCharacter(input));

        // 3. count the number of character in String and its repetition

        HashMap<Character,Integer> hmap = new HashMap<>();

        for (int i= input.length()-1;i>=0;i--){

            if(hmap.containsKey(input.charAt(i))){

                int count = hmap.get(input.charAt(i));
                hmap.put(input.charAt(i),++count);
            }

            else
                hmap.put(input.charAt(i),1);

        }
        System.out.println("NUmber of charcter count in String is: " +hmap);
        // printing above result in proper format
        hmap.forEach((k,v) -> System.out.println(+k +" : " +v));// this will return convert the ASCII value of charcter in o/p

        //printing using enhanced for loop

        for(Map.Entry<Character,Integer> entry : hmap.entrySet()){

            System.out.println(entry.getKey() +" : " +entry.getValue());

        }

        // 3. count the number of words in String and its repetition
        HashMap<String,Integer> hmap2 = new HashMap<>();
        String[] words = input.split(" ");

        for(String word : words){

            Integer count = hmap2.get(word);

            if(!(count==null)){
                hmap2.put(word,count+1);
            }
            else
                hmap2.put(word,1);
        }

        System.out.println("No. words count in HashMap is: " +hmap2);
    }

    // 2. reverse Charcter in String

    public static String reverseCharacter(String str){

        if(null==str || str.length()<=1){
            return str;
        }
        return reverseCharacter(str.substring(1))+ str.charAt(0);
    }


}
