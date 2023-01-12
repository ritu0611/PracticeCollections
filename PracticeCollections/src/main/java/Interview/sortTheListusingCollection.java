package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortTheListusingCollection {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(10);
        al.add(4);
        al.add(-9);
        al.add(10);
        al.add(1000);
        al.add(45);
        al.add(78);

        Collections.sort(al);
        System.out.println("Sorted arraylist is in ascending: " +al ); // ascending order

        // descending order sorting
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Sorted arraylist in descending: " +al ); // descending order

        List<Integer> streamArray = al.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted array using Stream in ascending: " +streamArray ); // ascending order

        List<Integer> streamArray2 = al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted array using Stream in ascending: " +streamArray2 ); // descending order
    }

}
