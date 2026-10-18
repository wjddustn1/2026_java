import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 위쪽: 1 ~ n개
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 아래쪽: n-1 ~ 1개 (오른쪽 끝 고정)
        for (int k = 1; k <= n - 1; k++) {
            for (int j = 1; j <= 2 * k; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - k; j++) {
                System.out.print("#");
                if (j < n - k) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}