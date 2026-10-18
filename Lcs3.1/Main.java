import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        for (int i = 0; i < 20; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
            count++;
        }

        int avg = count == 0 ? 0 : sum / count;
        System.out.println(sum + " " + avg);
    }
}
