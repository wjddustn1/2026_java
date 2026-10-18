import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int start = a < b ? a : b;
        int end = a > b ? a : b;

        int sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                count++;
            }
        }

        double avg = (double) sum / count;

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f\n", avg);
    }
}
