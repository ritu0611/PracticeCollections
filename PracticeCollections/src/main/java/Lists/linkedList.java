package Lists;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
     /*
     *LL are best choice for deletion and insertion ops cuz it have specified add in a  node, so it
     * becomes easy while inserting an object to respective position
     * it's not good when frequent retrieval is required cuz it every node has address and becomes cumbersome; for
     * that AL is best choice
     *
     * LL has two constructor
     * 1) LinkedList ll = new LinkedList(); -- default
       2) LinkedList all = new LinkedList(Collection c);--- with collection Object
     *
     *  */

        LinkedList ll = new LinkedList();
        ll.add("Ritu");
        ll.add(26);
        ll.addFirst("Tress");
        System.out.println("Elemets present in LL are " +ll);














    }
}
