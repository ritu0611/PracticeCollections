package Interview;

import java.util.Scanner;

public class reverseNumber {
    /**
     *
     * Declare an int variable say ‘num‘ and take value of it as user input, which needs to be reversed.
     * Then call a user defined method reverse() and pass that num as argument.
     * Inside method declare a variable rev = 0 to store the reversed number and run a while loop until the given number becomes zero.
     * Inside the while loop, extract the last digit using %(modulo) operator (num % 10) and add it to 10 times the value of rev.
     * Remove the last digit from the number by dividing it with 10.
     * Print the number outside the loop
     * */

    public static void main(String[] args) {


        //Scanner class object craeted
        Scanner sc = new Scanner(System.in);
        //taking user input of a Number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //callling reverse() method
        reverse(num);

    }

    //user defined method reverse() to find reverse
    public static void reverse(int num) {
        //intger variable 'rev' to store reverse value
        int rev = 0;

        //find reverse using while loop
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}