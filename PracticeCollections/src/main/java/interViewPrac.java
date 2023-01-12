import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Scanner;

public class interViewPrac {
    public static void main(String[] args) {
        //1 factorial

        System.out.println("Enter any integer number");
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        System.out.println("Fatorial of Number is: " + factorial(inputInt));

        // vowel or consonant

        System.out.println("Enter any String");
        Scanner sc1 = new Scanner(System.in);
        String inputInt2 = sc1.nextLine().replaceAll("\\s+","");
        System.out.println("Original String" +inputInt2);
        vowelOrConsonant(inputInt2);


        // no. of Characters in String
        /*
        1. Take input as String
        2. Define HashMap of Character and Interger as key-value
        3. traverse the input string in reverse order; for loop with input.lenght()-1
        4. check if map contains the key at given index then
        get count  and put it in map with incremmenteing counter

        int count = map.get(input.charAt(i))
        map.put(input.CharAt(i,++count);
        5. else
         map.put(input.charAt(i),1);
        * **/

        HashMap<Character,Integer> hcount = new HashMap<>();

        for(int i = inputInt2.length()-1; i>0;i--){

            if(hcount.containsKey(inputInt2.charAt(i))){
                int count = hcount.get(inputInt2.charAt(i));
                hcount.put(inputInt2.charAt(i),++count);
            }
            else
                hcount.put(inputInt2.charAt(i),1);
        }
        System.out.println(hcount);


        // no. of Words in String

        System.out.println("Enter String-------");
        Scanner sc3 = new Scanner(System.in);
        String inputInt3 = sc1.nextLine();
        System.out.println("Original String" +inputInt3);

        HashMap<String,Integer> wordMap = new HashMap<>();
        String words[] = inputInt3.split(" ");

        for (String word : words){
            Integer count = wordMap.get(word);

            if (!(count==null)){
                wordMap.put(word,count+1);
            }
            else
                wordMap.put(word,1);
        }
        System.out.println("No of words are" +wordMap);

        // find longestsubstring
    }

    public static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    public static void vowelOrConsonant(String s) {
        String str = s.toLowerCase();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                System.out.println("Given string contains " + str.charAt(i) + " at the index " + i);

            }
        }
    }

    public void longestSubstring(String s){

        char[] input = s.toCharArray();

        String longestSubString = null;
        int longestSubstringlength = 0;

        LinkedHashMap<Character,Integer> lHmap = new LinkedHashMap<>();

        for (int i=0; i<input.length;i++){

            char ch = input[i];

            if (!lHmap.containsKey(ch)){

                lHmap.put(ch,i);
            }

            else {
                i = lHmap.get(ch);
                lHmap.clear();
            }

            if(lHmap.size()> longestSubstringlength){
                longestSubstringlength = lHmap.size();
                longestSubString=lHmap.keySet().toString();
            }
        }

        System.out.println("input String is: " +s);
        System.out.println("Longestsubstring is: " +longestSubString);
        System.out.println("longestSubstring lenght is " +longestSubstringlength);

    }
}