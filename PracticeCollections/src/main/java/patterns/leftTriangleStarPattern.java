package patterns;

public class leftTriangleStarPattern {
    public static void main(String[] args) {
        /*
         * */

        leftStarPattern(5);
    }

    public static void leftStarPattern(int n) {

        //1st loop for rows
        for (int a = 0; a < n; a++) {
            // 2nd loop for printing spaces
            for (int b = 2 * (n - a); b >= 0; b--) {
                System.out.print(" ");
            }
            // 3rd loop for columns and printing star
            for (int c = 0; c <= a; c++) {
                System.out.print("* ");
            }
            // after each iteration of 1st loop moving to next line
            System.out.println();
        }
    }
}