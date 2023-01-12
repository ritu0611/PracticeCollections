package patterns;

public class righTriangleStarPattern {

    public static void main(String[] args) {

        /**

------------------------------
         *
         * *
         * * *
         * * * *
         * * * * *

         ---------------------------
         * */

        rightTriangleStar(5);
    }

    public static void rightTriangleStar(int n) {

        // outer loop to handle number of rows
        for (int a = 0; a < n; a++) {

            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (int b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }

            // end-line
            System.out.println();
        }
    }
}

