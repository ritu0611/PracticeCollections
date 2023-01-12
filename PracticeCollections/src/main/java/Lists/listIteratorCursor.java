package Lists;

import java.util.ArrayList;
import java.util.ListIterator;

/*
* 1. Works only with Lists
* 2. It is bi-directional Cursor; it can read, add, remove and replace  or perform any manipulation by moving forward
* and backward in list
*
* */
public class listIteratorCursor {
    public static void main(String args[]) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Ritu");
        al.add("kinju");
        al.add("chang");
        al.add("Grace");
        al.add("Thomas");
        al.add("parker");
        System.out.println(al);

        ListIterator<String> ls = al.listIterator();

        while (ls.hasNext()) {

            String value = ls.next();

            if (value.equals("Ritu")) {
                ls.remove();
            }
            if (value.equals("chang")) {
                ls.add("chong");
            }
//            if (ls.hasPrevious()) {
//                ls.add("Charlie");
//            }
            if (value.equals("parker")) {
                ls.set("Linkin Parker");
            }
        }

        System.out.println(al);
    }
}
