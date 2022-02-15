package loop;

import java.util.Scanner;

public class loop_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력해주세요");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = a;
        int min = a;

        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);
        scanner.close();
    }
}
