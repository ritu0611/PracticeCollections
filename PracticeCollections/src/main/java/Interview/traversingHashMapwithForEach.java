package Interview;

import java.util.HashMap;

public class traversingHashMapwithForEach {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Coke");
        hm.put(2,"ham");
        hm.put(3,"Burger");

        System.out.println("Original hmap is " +hm);

        hm.forEach((k,v)->
                System.out.println(k+ " : " +v +" "));
    }
}
