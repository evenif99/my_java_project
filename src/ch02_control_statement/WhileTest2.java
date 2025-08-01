package ch02_control_statement;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        //스캐너 장치 준비 , Java.util 안에 존재, 외부에서 수입한다.
        Scanner scan = new Scanner(System.in); // class에서 디테일하게 배움
        //스캐너 객체 생성;

        int total = 0; // 총점
        int count = 0; // 시행 횟수
        double average = 0.0; // 평균

        while (true){      // endless while loop : true값일 경우 무한반복
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt(); // scan.nextInt()에 정수를 넣으면 int에 할당
            //System.out.println("숫자: " + grade);

            if (grade<=0){
                System.out.println("음수 또는 0이어서 종료합니다.");
                break;
            }
            // 양수가 아닌 경우 계산을 하면 안됩니다.
            total += grade;
            count++;
        }

        System.out.println("총점 : " + total);
        average = (double) total / count;
        System.out.println(average);

    }
}
