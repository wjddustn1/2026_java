import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    // 숫자가 아닌 토큰(혹시 들어올 안내 문구)은 건너뛰고 정수만 읽음
    static int readInt() {
        while (!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        int[][] c = new int[2][3];

        System.out.println("first array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = readInt();
            }
        }

        System.out.println("second array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = readInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j]);
                if (j < 2) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}