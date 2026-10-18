import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];
        
        int totalSum = 0;
        
        // 데이터 입력 받기
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
                totalSum += arr[i][j];
            }
        }
        
        // 가로 평균 출력 (각 행의 합 / 2, 소수점 이하는 버림)
        for (int i = 0; i < 4; i++) {
            int rowSum = arr[i][0] + arr[i][1];
            System.out.print((rowSum / 2) + " ");
        }
        System.out.println();
        
        // 세로 평균 출력 (각 열의 합 / 4, 소수점 이하는 버림)
        for (int j = 0; j < 2; j++) {
            int colSum = 0;
            for (int i = 0; i < 4; i++) {
                colSum += arr[i][j];
            }
            System.out.print((colSum / 4) + " ");
        }
        System.out.println();
        
        // 전체 평균 출력 (전체 총합 / 8, 소수점 이하는 버림)
        System.out.println(totalSum / 8);
    }
}
