package loop;

import java.util.Scanner;

public class loop_3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("점수를 입력해주세요 > ");
        int score = scanner.nextInt();

        if(score < 0 || score > 101){
            System.out.println("점수 입력에 오류가 생겼어요");
        } else if (score >= 60 ){
            System.out.println("합격 입니다.");
        } else{
            System.out.println("불합격 입니다.");
        }
        scanner.close();
    }
}
