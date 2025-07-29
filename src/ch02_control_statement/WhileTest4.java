package ch02_control_statement;

import java.util.Scanner; // 스캐너 장치를 사용하기 위한 장치1

public class WhileTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // " 장치2

        int total = 0;
        double average = 0;
        int count = 0;
        while (true) {
            // 횟수가 불분명할 때 사용, 반복이 무한대이므로 반복을 끝낼 조건을 사용해야 함(대부분 if~break 문을 사용)
            System.out.print("점수입력 : ");
            int grade = scan.nextInt(); // " 장치3

            if (grade < -10){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else if (grade <0){
                grade = -grade;
            }
            count++;
            total +=grade;
        }
        System.out.println("총 시험 빈도(회수) : " + count);
        System.out.println("총점 : " + total);
        average = (double)total/count;
        System.out.println("평균 : " + average);
    }
}
