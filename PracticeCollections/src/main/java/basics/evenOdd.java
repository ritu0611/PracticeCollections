package basics;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {

        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        isEvenOdd(input);
    }
    public static Boolean isEvenOdd(int var){

        if(var %2 == 0){
            System.out.println("Given no " +var +" is an even number");
        return true;}
        else
            System.out.println("Given no " +var +" is an odd number");
            return false;
    }
}
