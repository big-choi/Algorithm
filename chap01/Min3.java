package chap01;

import java.util.Scanner;

class Min3 {
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.print("a의 값 : "); a = scanner.nextInt();
        System.out.print("b의 값 : "); b = scanner.nextInt();
        System.out.print("c의 값 : "); c = scanner.nextInt();

        scanner.close();

        int min = min3(a, b, c);

        System.out.println("최솟값은 : " + min + "입니다.");


    }
}
