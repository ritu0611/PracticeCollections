package hashSet;

import java.util.TreeSet;

public class comparableAndComparator {
    public static void main(String[] args) {
        /**
         * A) Comparable
         * - pressents in java.lang pkg
         * - consist only single method : public int compareTo(Object O)
         *- Meant  for Default sorting order[i.e asvending order]
         * - Internally JVM follows balanced tree structure to sort it
         * ==> FOr Eg: if  "M","K" and "R" are inserted in sorted tree
         * then 1. "M" will be added as root element without comparision
         * > For "K"  JVM will call internally this compareTo method i.e K.compare(M) and it'll return -1
         * as ASCII value of K is less than M , so it'll be inserted oLEFT side of tree
         * > For "R"  JVM will call internally this compareTo method i.e R.compare(M) and it'll return +1
         *  as ASCII value of R is more than M , so it'll be inserted RIGHT side of tree
         *
         * */

        TreeSet<Integer> data = new TreeSet<>();
        data.add(152);
        data.add(185);
        data.add(254);
        data.add(10);
        data.add(132);
        data.add(10);

        System.out.println(data);



        /**
         * A) Comparator
         * - Presents in java.util pkg
         * - it is used when you want to customize the sorting order of TreeSet and this interface must be
         * implemented
         * - it has two methods
         * 1) public boolean equals(Object ob)
         * -  Implementation is not required
         * - As Object is the parent class for every Java Class and this equals method is already present their
         * so no need to implement the definition whenever we're implementing Comparator Interface
         * 2) public int compare(object ob1, Object ob2)
         *
         * - We can give our own implementation
         *
         * 3) JVM will work accordingly internally the way we have provided for sorting the elements
         * over here it is descending order
         *
         * ==> FOr Eg: if  "M","K" and "R","K" are inserted in sorted tree
         *          * then 1. "M" will be added as root element without comparision
         *          * > For "K"  JVM will call internally MySorting() as we have defined i.e compare(M,K) and it'll return +1
         *          * as ASCII value of K is less than M , so it'll be inserted RIGHT side of tree
         *          * > For "R"  JVM will call internally tMySorting() as we have defined i.e compare(M,R)  and it'll return -1
         *          *  as ASCII value of R is more than M , so it'll be inserted LEFT side of tree
         *          > For "K" again JVM will call internally MySorting() as we have defined i.e compare(M,K)  and it'll return 0
         *          * as it is already present in TreeSet and it won't allow duplicate value
         *
         * */

        TreeSet<Integer> data1 = new TreeSet<Integer>(new MySorting()); // passing the customised sorting order in treeSet constructor
        data1.add(152);
        data1.add(185);
        data1.add(254);
        data1.add(10);
        data1.add(132);
        data1.add(10);

        System.out.println(data1);

    }
}
