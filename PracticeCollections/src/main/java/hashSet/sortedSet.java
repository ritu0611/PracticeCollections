package hashSet;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSet {
    /*
    * 1. Sortedset is a Interface that implements Set Interface
    * 2. In sorted set , elements are stored in sorting order[by default ascending]
    * 3. TreeSet is the implementation class of SortedSet
    * 4. SortedSet accepts only homogeneous elements as it is not logical to apply sorting on
    * heterogeneous elements
    *
    * */

    public static void main(String args[]){

        SortedSet st = new TreeSet();// as Sorted set is interface cannot be intantiated,
        // hence creating object using Treeset()

        st.add(10);st.add(20);st.add(80);st.add(45);st.add(1);st.add(5);st.add(7);
        System.out.println(st);

        // Methods in sorted Interface TreesetCollection Integrer

        //object first
        System.out.println(st.first());

        //object last
        System.out.println(st.last());

        // headSet(Object o)
        System.out.println(st.headSet(7)); // print the sorted set that comes before the value 7
                                            // o/p : [1,5]
        // tailSet(Object o)
        System.out.println(st.tailSet(7)); // print the sorted set that comes after the value 7 including 7
                                            // o/p : [7,10,20,45,80]

        // subSet(Object o, Object p)
        System.out.println(st.subSet(7,45)); // print the sorted set with objwcts between (7,45) including 7
                                            // o/p : [7,10,20] i.e 1st index is always included

        // Comparator comparator
        // it returns the order of the sorting of SortedSet
        // by default for natural order i.e ascending order it'll return null
        System.out.println(st.comparator()); // returns null



        //***************************************
        // NavigableSet
        /**
         *1. Navigable set is the child interface of Sorted Set
         * 2. Hence it implements all the functionality of SortedSet as well as Collection Interface
         * 3. Implementation class is TreeSet
         * 4. It contains method that are used for navigation functionalities; i.e used to report
         * closest search or target elements
         *
         */


        //assigning treeSet object to navigableSet reference
        NavigableSet<Integer> data = new TreeSet<Integer>();

        //adding elements
        data.add(1000);
        data.add(3000);
        data.add(13000);
        data.add(40000);
        data.add(54000);
        System.out.println("---- Tree Set ----");
        System.out.println(data);
        System.out.println("-----------------------------------------");

        //Methods

        System.out.println(data.floor(13550)); // returns greatest element in the set which is less than
        // or equal to passed number or Null if that element doesn't exists

        System.out.println(data.lower(14000));//returns greatest element in the set which is less than
        // or equal to passed number or Null if that element doesn't exists

        System.out.println(data.ceiling(2500));//returns the least element in the set which is greater than
        // or equal to passed number or Null if that element doesn't exists

        System.out.println(data.higher(4000));//returns the least element in the set which is greater than
        //passed number or Null if that element doesn't exists

        System.out.println(data.pollFirst());//retrieve and remove the first least element. Or
        // returns Null if that element doesn't exists

        System.out.println(data.pollLast());//retrieve and remove the last highest element. Or
        // returns Null if that element doesn't exists


        System.out.println(data.descendingSet());//returns navigable set in descending order







    }
}
