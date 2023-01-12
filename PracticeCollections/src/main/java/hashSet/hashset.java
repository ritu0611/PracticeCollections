package hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashset {

    /*
    * 1. Order is not preserved and duplicates are not allowed
    * 2. Hashset doesn't have it own methods so it uses the methods of Collection Interface
    * 3. If searching is frequent operation then one should go for Hashset
    * 4. Underlying ds for Hashset is Hashtable
    * 5. In Hashtable data are stored using Hashing Mechanism
    * 6. Hashing is concept which finds the index where the object should be stored at which index in Hashtable
    *  basically the logic behind it is
    * - a = Integer value of input stored as obj(in case of String relavant ASCII values)
    *  - b = size of Hashtable(i.e capacity of hashSet)
    * - index of element = a%b
    *
    * */
    public static void main(String args[]){

        ArrayList al = new ArrayList();
        // Constructors in Hasset : total 4 constructor
        HashSet hs = new HashSet(); // default size of hashset is 16
        HashSet hs1 = new HashSet(20);// creating hashset with intial capacity
        // LoadFactor specifies that when the hashset is being filled with given load
        // for eg: .80f = 80% then the capacity of hashset should be doubled(here 20*2 =40)
        //and all the values should be stored in newly created doubled capacity hashSet and
        // old one is ready for Garbage collection
        HashSet hs2 = new HashSet(20,.80f);
        HashSet hs3 = new HashSet<>(al); // passing Collection object to create equivalent Hashset


        ///*****************************************************

        //LINKED HASHSET

        /*
        * 1. In order to preserved the insertion order in HashSet, Linked Hashset is used
        * 2. Underlying ds for LinkesdHashset is a combination of LInkedList and Hashtable
        * 3. all the methods of collection Interfaces can be used
        * */

        LinkedHashSet lhs = new LinkedHashSet();
        LinkedHashSet lhs1 = new LinkedHashSet(10);
        LinkedHashSet lhs2 = new LinkedHashSet(10,.25f);


    }
}
