public class invertdHalfPyramid_180_deg {
    public static void main(String args[]) {
        int n = 4;
        // out loop
        for (int i = 1; i <= n; i++) {
            // inner loop >> Space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
