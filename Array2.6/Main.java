public class Main {
    public static void main(String[] args) {
        int[][] A = new int[5][5];

        // 1행(인덱스 0)의 1열, 3열, 5열(인덱스 0, 2, 4)을 각각 1로 초기화
        A[0][0] = 1;
        A[0][2] = 1;
        A[0][4] = 1;

        // 2행부터는 바로 윗행의 왼쪽 값과 오른쪽 값을 더해서 채움
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int left = (j > 0) ? A[i - 1][j - 1] : 0;
                int right = (j < 4) ? A[i - 1][j + 1] : 0;
                A[i][j] = left + right;
            }
        }

        // 결과 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
