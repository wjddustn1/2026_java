public class Main {
    public static void main(String[] args) {
        int[][] A = {
            {3, 5, 9},
            {2, 11, 5},
            {8, 30, 10},
            {22, 5, 1}
        };

        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
                sum += A[i][j];
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}
