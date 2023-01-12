package patterns;

public class reversePyramidStarPattern {
    public static void main(String[] args) {

        reversePyramidStarsPattern(6);
    }

    public static void reversePyramidStarsPattern(int n) {

        for (int a = n; a >= 0; a--) {
            for (int b = a; b <n; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
