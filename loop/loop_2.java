package loop;

import java.util.Scanner;

public class loop_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("정수를 입력해주세요 > ");
        int Integer = scanner.nextInt();
        if (Integer%2==0){
            System.out.println("2의 배수 입니다.");
        } else {
            System.out.println("2의 배수가 아닙니다.");
        }
        scanner.close();
//        System.out.println(Integer);
    }
}
