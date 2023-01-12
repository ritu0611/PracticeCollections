package patterns;

public class diamondStarPattern {
    public static void main(String[] args) {
        diamondStarsPattern(6);

    }

    public static void diamondStarsPattern(int n) {

        for (int a = 0; a < n; a++) {
            for (int b = n - a; b >= 0; b--) {
                System.out.print(" ");
            }
            for (int c = 0; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
