package Queue;

import java.util.*;

public class priorityQueue {

    public static void main(String[] args) {

        /**
         * 1) In Priority Insertion Queue order is not preserved and duplicates are not allowed
         * 2) Null insertion is not allowed
         * 3) Priority Queue is used when want to perform add/remove depends on some default/customize priority
         * 4) It does not allow hetereogeneous elements
         *5) 4 constructor in Priority Queue
         * 6) It follows FIFO
         *
         *
         * */

        //creating priorityQueue
        PriorityQueue pq = new PriorityQueue();
        //defaul size = 11
        //DNSO

        //creating priorityQueue with specified size
        PriorityQueue pq1 = new PriorityQueue(20);

        /**
        creating priorityQueue with initial capacity and comparator object
        PriorityQueue pq2 = new PriorityQueue(int initialCapacity,Comparator c);
         **/


        SortedSet s = new TreeSet();
        //creating priorityQueue equivalent to sortedSet s
        PriorityQueue pq3 = new PriorityQueue(s);

        List l = new ArrayList();
        //creating equivalent priorityQueue for any collection
        PriorityQueue pq4 = new PriorityQueue(l);

        //Methods in PQ
        pq1.peek();pq1.poll(); // etc
    }

}
