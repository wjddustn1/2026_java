import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[3][5];

        // 3행 5열의 대문자를 입력받아 소문자로 변환하여 배열에 저장
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                char c = sc.next().charAt(0);
                arr[i][j] = (char) (c + 32); // 대문자를 소문자로 변환 (또는 Character.toLowerCase(c) 사용 가능)
            }
        }

        // 변환된 소문자를 공백으로 구분하여 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
