package Lists;

import java.util.Stack;

public class stack {
    public static void main(String[] args){
        /*
        *Underlying data structure is Stack
        * Follows LIFO principle
        * as it is part of Lists it holds all its properties
        *
        * */

        Stack stack = new Stack();// it has only one constructor i.e default one
        stack.push(10);// for insertion of element
        stack.push("Ritu");
        stack.push(true);
        System.out.println("No of elements" +stack);

        stack.pop();//removes topmost element over here 'true'
        System.out.println("No of elements" +stack);

        Object top = stack.peek();// retrives top most element
        System.out.println("No of elements" + top);

        System.out.println("Is stack is empty ?" +stack.isEmpty());

        // search
        System.out.println("IS Ritu present" +stack.search("Ritu"));
    }
}
