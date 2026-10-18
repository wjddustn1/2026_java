import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'J', 'U', 'N', 'G', 'O', 'L'};
        
        char target = sc.next().charAt(0);
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print(index);
        } else {
            System.out.print("none");
        }
    }
}
