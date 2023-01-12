package Interview;

import Map.Map;

import java.util.HashMap;
import java.util.Scanner;

public class countOccurenceofWords {
    /**
     * Declare a HashMap in Java of <String, Integer>
     * Split the given string and store the words into a String array.
     * Traversing the array, check if the word is in the HashMap or not.
     * If it is not in the HashMap, then store the word as key and 1 as the initial value;
     * if the word is present in the HashMap then increase the value against the word.
     * Once the traversal is complete, print the HashMap.
     */

    public static void main(String[] args) {

        System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Declaring a HashMap of <String, Integer>
        HashMap<String, Integer> hmapCount = new HashMap<>();

        // Splitting the words of string
        // and storing them in the array.
        String[] words = input.split(" ");

        for (String word : words) {

            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer count = hmapCount.get(word);

            // checking if the count not equals to null then increement the word count by 1
            if (!(count == null)) {

                // Incrementing the value if the word
                // is already present in the HashMap.
                hmapCount.put(word, count + 1);

            } else
                // Storing the word as key and its
                // occurrence as value in the HashMap.
                hmapCount.put(word, 1);
        }


        System.out.println(hmapCount);
    }
}
