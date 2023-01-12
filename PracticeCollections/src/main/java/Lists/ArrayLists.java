package Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args){
        /*
        Underlyingdata structure is Array
        present in java.util package
        allows duplicates elements and preserved the order
        ArrayLists are resizable or growable array
        It's better to define size of AL in order to reduce time complexity
        Best practice is always define AL in Generic form which will help to reduce Runtime Error,
        run time type casting or converstion error
        *
        * */

        // creating and declaring Arraylist
        ArrayList al = new ArrayList(); // this creates empty arraylist with dafault size 10; if size not provided
                                      //if insertion exceeds the default size...then jvm creates
                                      //new AL of size ((currentsize*3/2)+1) i.e ((10*3/2)+1)=16, which means doubling size)

        List al1 = new ArrayList();

        // manipulation on arraylist with existing methods

        //1. adding elements
        al.add("Ritu");
        al.add(26);
        al.add(true);
        System.out.println(al);

        // 2. removing elements or object
        al.remove(0);
        //al.remove(new Integer(26));// removing list via object this is been deprecated
        System.out.println(al);

        // 3. search the elemtns
        al.get(1);
        System.out.println("Total elemts are" + al);


        // 4. Syntx for generic arraylist
        ArrayList<String> arrStr = new ArrayList<>(20);
        arrStr.add("Ritu");
        arrStr.add("kinju");
        System.out.println("Elemets present in AL are " +arrStr);

        /*
        5. No of constructors AL has by default are 3
        Default Constructtor : ArrayList<String> arrStr = new ArrayList<>();
        Constructor with size: ArrayList<String> arrStr = new ArrayList<>(20);
        Constructor have Collection Object : ArrayList<String> arrStr = new ArrayList<>(Collection c);
        * */
    }
}
