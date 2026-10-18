import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1000;
        int min = 1000;
        boolean first = true;

        while (true) {
            int x = sc.nextInt();
            if (x == 999) {
                break;
            }
            if (first) {
                max = x;
                min = x;
                first = false;
            } else {
                if (x > max) {
                    max = x;
                }
                if (x < min) {
                    min = x;
                }
            }
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
