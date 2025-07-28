package ch02_control_statement;

public class Exam4_16 {
    public static void main(String[] args) {
        int star = 24;
        for (int i = 1; i <= star; i++) {
            System.out.print("*"); // println과 print의 차이점을 알아 둘 것
            if (i % 5 == 0){ // 단순 if문 사용시 조건식()뒤에 {}를 사용하여 출력할 것
                System.out.println();
            }
        }
    }
}
