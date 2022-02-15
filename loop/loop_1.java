package loop;

import java.util.Scanner;



public class loop_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 > ");
        int score = scanner.nextByte();

        if (score >= 70) {
            System.out.println("해당 학생의 점수는 " +score+"점 이며, 합격입니다.");
        } else {
            System.out.println("해당 학생의 점수는 " +score+"점 이며, 불합격입니다.");
        }
        scanner.close();
    }
}