package loop;

import java.util.Scanner;

public class loop_5 {
    public static void main(String[] args) {
        System.out.println("당신의 키를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int standard = 110;

        if(height >= standard){
            System.out.println("키가 " + standard + "cm 이상입니다. 탑승해주세요");
        }
        if (height < standard){
            System.out.println("보호자가 곁에 있으면 : 1  / 없으면 0 입력 ");
            int parents = scanner.nextInt();
            if(parents == 1){
                System.out.println("보호자와 같이 동반탑승 해주세요");
            } else {
                System.out.println("다음에 보호자랑 같이 와주세요");
            }
//            System.out.println("키가 " + standard + "cm 이상입니다. 탑승해주세요");
        }
        scanner.close();
    }
}
