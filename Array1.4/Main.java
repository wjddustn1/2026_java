import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int cnt = 0;

        while (true) {
            int x = sc.nextInt();
            if (x == -1) {
                break;
            }
            arr[cnt] = x;
            cnt++;
        }

        int start = 0;
        if (cnt >= 3) {
            start = cnt - 3;
        }

        for (int i = start; i < cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
