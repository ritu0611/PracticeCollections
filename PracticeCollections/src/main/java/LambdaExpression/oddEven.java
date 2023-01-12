package LambdaExpression;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class oddEven {
    public static void main(String[] args) {

        //PerformOperation isOdd(): The lambda expression must return true  if a number is odd or  false if it is even.

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Predicate<Integer> p;

        p = x -> (a % 2 == 0);
        p = p.negate();

        System.out.println("Print result: " + p.test(a));


    }
}
