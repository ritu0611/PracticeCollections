package Interview;

import java.util.HashSet;
import java.util.Scanner;

public class findAllStringHasuniqueCHaracter {

    /*
     *1. Create a HashSet object.
      2. Scan the whole string, and add each character one by one to the HashSet object
      3. If the add object  returns true then continue
       else return false
     *
     * */
    public static void main(String[] args) {

        boolean result = false;
        System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        // to ignore whitespaces can be done

        String input = input1.replaceAll("\\s","");

        HashSet<Character> uniqueChar = new HashSet<>();

        for (int i = 0; i < input.length(); i++) { // in condition cannot take <=input.length() cuz it'll throw
                                                   // arrayOutofIndex exception

            result = uniqueChar.add(input.charAt(i));

            if (!result)
                break;
        }

        System.out.println(uniqueChar);
        System.out.println(result);

        // i/p : POLE, POLE ROLE==>
        //O/p : true, false


    }
}
