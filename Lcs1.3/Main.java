import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int n = sc.nextInt();
            if (n < 0 || n > 100) {
                break;
            }
            sum += n;
            count++;
        }

        double avg = (double) sum / count;
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f\n", avg);
    }
}
