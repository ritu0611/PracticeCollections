package Interview;

import java.util.LinkedHashMap;

public class findLongestSubstring {

    static void longestSubstring(String inputString) {

        /**

         1. Create a function with String Argument
         2. Convert input String to charArray
         3. initialize two variables one for length of substring and another one for longestSubstrin
         4. Creating LinkedHashMap with characters as keys and their position as values.
         5. Iterating through charArray using for loop and store each charcter in
         seperate vaiable e: char ch = charArray[i];
         6. If ch is not present in LinkedHashMap,
         adding ch into Map along with its position
         map.put(ch,i);
         7. else
         ch is already present in LinkedHashMap,reposioning the cursor i to the position
         of ch and clearing the charPosMap
         else {
         i = charPosMap.get(ch); // LinkedHashMap
         charPosMap.clear();
         }
         8. Updating variables initialized at step-3
         longestSubstring and longestSubstringLength

         if (charPosMap.size() > longestSubstringLength) {
         longestSubstringLength = charPosMap.size();
         longestSubstring = charPosMap.keySet().toString();
         }


        *


        **/
        //Convert inputString to charArray

        char[] charArray = inputString.toCharArray();

        //Initialization

        String longestSubstring = null;

        int longestSubstringLength = 0;

        //Creating LinkedHashMap with characters as keys and their position as values.

        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();

        //Iterating through charArray

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];

            //If ch is not present in charPosMap, adding ch into charPosMap along with its position

            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            }

            //If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap

            else {
                i = charPosMap.get(ch);

                charPosMap.clear();
            }

            //Updating longestSubstring and longestSubstringLength

            if (charPosMap.size() > longestSubstringLength) {
                longestSubstringLength = charPosMap.size();

                longestSubstring = charPosMap.keySet().toString();
            }
        }

        System.out.println("Input String : " + inputString);

        System.out.println("The longest substring : " + longestSubstring);

        System.out.println("The longest Substring Length : " + longestSubstringLength);
    }

    public static void main(String[] args) {
        longestSubstring("javaconceptoftheday");

        System.out.println("==========================");

        longestSubstring("thelongestsubstring");
    }
}
