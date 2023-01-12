package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {

        System.out.println("Enter three integer no. of your choice");
        Scanner sc = new Scanner(System.in);
             int a= sc.nextInt();
             int b= sc.nextInt();
             int c= sc.nextInt();

        int largest = a>(b>c?b:c) ? a : ((b>c)?b:c); // method-1

        int mlargest = Math.max(a,(Math.max(b, c)));// method-2

        System.out.println(largest);
        System.out.println(mlargest);

        ////method-3 using collections
        ArrayList<Integer> al = new ArrayList<>();
        al.add(a);al.add(b);al.add(c);
        System.out.println("Largest from AL: " + Collections.max(al));// method-3
    }

}
