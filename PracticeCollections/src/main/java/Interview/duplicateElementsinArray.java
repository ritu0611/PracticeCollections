package Interview;

public class duplicateElementsinArray {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate Array in list are");

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[j]);
                }
            }
        }
    }
}
