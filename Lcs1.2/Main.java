import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0;
        int even = 0;

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}
