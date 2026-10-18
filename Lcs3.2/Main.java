import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i < 100; i += n) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                break;
            }
        }
        System.out.println();
    }
}