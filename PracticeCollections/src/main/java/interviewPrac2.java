import java.util.HashMap;
import java.util.Scanner;

public class interviewPrac2 {
    public static void main(String[] args) {
        //count number of char in String and repetetive
        System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<Character,Integer> charcount = new HashMap<>();

        for (int i=input.length()-1;i>=0;i--) {

            if (charcount.containsKey(input.charAt(i))) {

                int count = charcount.get(input.charAt(i));
                charcount.put(input.charAt(i), ++count);
            } else

                charcount.put(input.charAt(i), 1);
        }
            System.out.println(charcount);

        // count of words:

        System.out.println("Enter any words String");
        Scanner sc1 = new Scanner(System.in);
        String[] input2 = sc.nextLine().split(" ");
        HashMap<String,Integer> wordcount = new HashMap<>();

        for (String word: input2){

            Integer count = wordcount.get(word);

            if (!(count==null)){
                wordcount.put(word, count+1);
            }
            else{
                wordcount.put(word,1);
            }

        }
        System.out.println("No .of words are" + wordcount);
    }

}
