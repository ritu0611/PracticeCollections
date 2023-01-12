package Interview;

import java.util.HashMap;
import java.util.Scanner;

/**
 * algorithm
 *
 * 1. Create HashMap of Character as key and Integer as value
 * 2. iterate for loop with input's String length in reverse order
 * 3. check in for loop
 * if map.containskey(at given index of i/p string)
 * then map.put(input.charAt(i),++count) -->  increment count if char already exist in map
 *
 * 4. else
 * map.put(input.charAt(i),1) --> assigning value 1 to respective character
 *
 *
 * */
public class countNumberofCharsinString {
    public static void main(String[] args) {

        System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<Character,Integer> charcount = new HashMap<>();

        for(int i= input.length()-1;i>=0;i--){


            if(charcount.containsKey(input.charAt(i))){

                int count = charcount.get(input.charAt(i));

                charcount.put(input.charAt(i),++count);
            }

            else
                charcount.put(input.charAt(i),1);
        }

        System.out.println(charcount);

    }

}
