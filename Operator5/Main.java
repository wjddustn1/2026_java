import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minsuHeight = sc.nextInt();
        int minsuWeight = sc.nextInt();
        int giyoungHeight = sc.nextInt();
        int giyoungWeight = sc.nextInt();

        boolean result = (minsuHeight > giyoungHeight) && (minsuWeight > giyoungWeight);

        System.out.println(result);
    }
}