package Lists;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorCursor {

    public static void main(String[] args) {

        /**
         Itreator cursor can be used by any class across the collection; it's not limited to legacy classes
         It is unidirectional cursor i.e moving in forward direction only
         used to iterate elements in the collection
         Iterator has add and remove access in forward direction only
         **/

        ArrayList<String> months = new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Apr");
        months.add("May");
        months.add("June");
/*
        Iterator itr = months.iterator();// creating iterator using iterator() method of al class
        while (itr.hasNext()) { // specifies if itr has more elements to traverse or not

            String s = (String) itr.next(); // return the element where currect cursor is pointing and shifts the cursor to next element

            if(s.equalsIgnoreCase("Feb")){
                months.add("March");
                months.remove(5);

            }*/

             /*Uncommenting the above code will throw 'ConcurrentModificationException' because
            When you try to modify any collection class during the traversal
             the compiler throw ConcurrentModificationException. You will see the Exception in
             the main thread “java util concurrent modification exception”.
             This exception can occur in a multithread environment as well as in a single thread environment.
            The Collection classes in java are fail-fast, which means we can’t modify the collection
             when a thread is traversing over it using an iterator,
             the iterator.next() will throw ConcurrentModificationException;
             In the above code we are using .add or .remove method of class ArrayList but if we use Iterator's
             remove method then the element can be removed successfully*/

        Iterator<String> itr1 = months.iterator(); // By of Iterator.remove() method
            while (itr1.hasNext()) {
                String s2 = itr1.next();
                if (s2.contains("Feb")) {
                    itr1.remove();
                }
            }
        System.out.println("After removing the object " + months);
        }


    }

