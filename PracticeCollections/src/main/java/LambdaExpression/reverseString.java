package LambdaExpression;

import java.util.Scanner;

interface reverseStringI{

    String reverseStringIs(String str);
}

public class reverseString {
    public static void main(String[] args) {

        System.out.println("Enter the String to be reversed");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

       reverseStringI refStr = s -> {

           String result = "";
           for (int i = s.length() - 1; i >= 0; i--) {
               result = result + s.charAt(i);
           }
           return result;
       };

        System.out.println("Reversed String is: " +refStr.reverseStringIs(input));

       }

}
