package basics;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter any integer number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Fatoria of given number is: " +factorial(input));

    }
    public static int factorial(int n){
        return (n==1||n==0)?1:n*factorial(n-1);
    }
}
