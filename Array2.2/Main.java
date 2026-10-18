import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[11];

        while (true) {
            int score = sc.nextInt();
            if (score == 0) {
                break;
            }
            cnt[score / 10]++;
        }

        for (int i = 10; i >= 0; i--) {
            if (cnt[i] > 0) {
                System.out.println((i * 10) + " : " + cnt[i] + " person");
            }
        }
    }
}