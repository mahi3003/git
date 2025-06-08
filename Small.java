public class Small {
    public static void main(String[] args) {
        int a = 15;
        int b = 7;
        int c = 20;

        int smallest;

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}
