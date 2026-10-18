import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] p = new int[n][n];
        
        // 파스칼 삼각형 생성
        for (int i = 0; i < n; i++) {
            p[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                p[i][j] = p[i - 1][j - 1] + p[i - 1][j];
            }
        }
        
        // 마지막 행부터 첫 번째 행까지 차례로 출력
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
    }
}
