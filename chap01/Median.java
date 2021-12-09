package chap01;


import java.util.Scanner;

//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력.
public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b)  //a가 b보다 같거나 클경우 a b
            if (b >= c)  //b가 c보다 같거나 클경우 a b c
                return b;  //b
            else if (a <= c)  //c가 a보다 같거나 클경우 c a b
                return a; //a
            else  //
                return c; // a c b

        else if (a > c) //
            return a;
        else if (b > c)
            return c;
        else
            return b;

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다");
        System.out.println("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.println("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.println("c의 값 : ");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다");
    }
}
