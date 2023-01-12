package Lists;

import java.util.Collection;
import java.util.Vector;

public class vector {
    public static void main(String[] args){

        /*
        * Underlying data structure of Vector is Array
        * It implements Serialiazle, clonnable and RandomAccess Interface
        * In AL every method is not synchronized i.e multiple threads can access a single element at a time
        * Whereas Vectors are thread-safe---- all methods are synchronized
        * Performance is low because threads  need to wait in order to operate the obj/elements
        * and on other side for AL performance is high as it's not thread safe
        *
        * */

        //No of Constructors Vector have

        Vector v1 = new Vector(); // default size is 10 ; if insertion exceeds the default size...then jvm creates
                                 //new vector of size (currentsize*2 i.e 10*2=20, which means doubling size)
        Vector v= new Vector(10);
        Vector v2 = new Vector(10,5);// second parameter specifies the no of size if vector holds after it reaches to 10
        //Vector V3 = new Vector(Collection c);

        v.addElement("Kinju");
        v.add("Sam");
        v.add(10);
        v.add("Uma");
        v.add(32);
        System.out.println("Elemets present in Vector are " +v);
        v.removeElement("Sam");
        System.out.println("Elemets present in Vector are " +v);
        v.firstElement();
        v.lastElement();
        System.out.println("Elemets present in Vector are " +v);
        System.out.println("Elemets present at given index " +v.get(1));
        System.out.println("Size"+v.size());// no. of memory occupied by vector // over here it would be 4 as one element removed
        System.out.println("Capacity"+v.capacity());// no. of memory given when declaring vector // over here it would be 10




    }
}
