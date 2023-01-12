package hashSet;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;



public class treeSetDemo {
    /**
     * 1. Treeset only accepts homogeneous element
     * 2. Elements are inserted in some soting order and we cannot perform on heterogenos element; if we try to do so
     * it'll throw R.E "Class Cast Exception
     3. Implementation is based on Balanced tree where duplicates are not allowed and insertion order is also not
     preserved but eleemnts qare inserted in some sorting order
     4. 1st element added to tree act as Root Element and if we enter new element which is < rootValue then it'll be inserted
     on LEFT and if new inserted value is greater than root value it'll be added to the RIGHT and it'll go on
     5. TreeSET will accept "NULL" value only when tree set is empty; i.e NUll is the 1st element of tree set; and
     afterwards if we try to add any other value/element it'll throw N.P.E
     6. TreeSet should implement "Comparator" interface in terms of defining it Generic as Comparator is used to
     perform customised sorting order on given Treeset
     *
     * */
    public static void main(String args[]){

        //creating treeSet
        TreeSet ts = new TreeSet();

        //creating treeSet by passing comparator object
        //TreeSet ts1 = new TreeSet(Comparator c);

        SortedSet s = new TreeSet();

        //equivalent treeSet of sortedSet
        TreeSet ts2 = new TreeSet(s);

        HashSet hs = new HashSet();

        //equivalent treeSet of HashSet
        TreeSet ts3 = new TreeSet(hs);

        //treeSet with generics syntax
        TreeSet<Employee> ts4 = new TreeSet<Employee>();
        ts4.add(new Employee("John",30000));
        System.out.println(ts4);
    }

}
