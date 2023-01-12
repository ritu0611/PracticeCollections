package patterns;

public class bothWayPyramids {
    public static void main(String[] args) {
        bothWaysPyramids(5);
    }

    public static void bothWaysPyramids(int n) {

        for (int a = 0; a < n; a++) {
            for (int b = n - a; b >= 0; b--) {
                System.out.print(" ");
            }
            for (int c = 0; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /// reverse

        for (int a = n; a >= 0; a--) {
            for (int b = a-1; b <n; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

