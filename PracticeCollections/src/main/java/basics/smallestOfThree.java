package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class smallestOfThree {
    public static void main(String[] args) {
        System.out.println("Enter three integer no. of your choice");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int smallest = a<(b<c?b:c) ? a : ((b<c)?b:c);//method-1
        int mSmallest = Math.min(a,(b<c?b:c));//mehtod-2

        System.out.println(smallest);
        System.out.println(mSmallest);

        ////method-3 using collections
        ArrayList<Integer> al = new ArrayList<>();
        al.add(a);al.add(b);al.add(c);
        System.out.println("Largest from AL: " + Collections.min(al));// method-3

    }
}
