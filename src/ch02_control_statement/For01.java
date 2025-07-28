package ch02_control_statement;

public class For01 {
    public static void main(String[] args) {
        int total = 0; // 변수를 정의, 0을 대입
        for (int i = 1; i <= 10 ; i++) {
            total += i;
        }
        System.out.println("총합01 : " + total);

        total = 0;
        for (int i = 1; i < 101; i += 3)
            //초기식 : int i = 1; 초기식은 최초 한번만 실행
            //조건식 : i <= 100 or i < 101;
            //증감식 : i = i + 3 or i += 3 (i에 해당 값을 누적)
            //증감식이 'true'인 경우 까지 적용하여 {}의 식(total)을 실행
            //total의 i의 계산식은 계산에 맞춰 변경 가능
        {    total += i;
        }
        System.out.println("총합02 : " + total);
        //for 문장이 끝나면서 (조건식이 false로 도출될 때) i는 소멸
        //출력된 total 또한 소멸

        total = 0;
        for (int i =97 ; i >1 ; i -= 5) {
            total += i;
        }
        System.out.println("총합03 :" + total);

        total = 0;
        for (int i = 1; i <97 ;i+=5 )  {
            total += i*i;
        }
        System.out.println("총합04 : " + total);

        total = 0;
        for (int i = 1; i <6 ;i++ ) {
            total += i*(i+1);
        }
        System.out.println("총합05 : " + total);
    }
}
//메모장을 사용하여 변수 값의 추이에 대하여 반드시 작성해보록 하자