import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        while (true) {
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
            arr[count] = x;
            count++;
        }

        System.out.println(count);

        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print((arr[i] * 2) + " ");
            } else {
                System.out.print((arr[i] / 2) + " ");
            }
        }
    }
}
