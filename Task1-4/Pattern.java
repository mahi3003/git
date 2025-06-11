public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= 6 - i; j--) {
                System.out.print(j);
            }
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(6 - i);
            }
            System.out.println();
        }
    }
}

    

