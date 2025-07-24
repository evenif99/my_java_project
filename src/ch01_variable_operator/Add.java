package ch01_variable_operator;

public class Add {
    public static void main(String[] args) {
        // 변수를 선언(정의)
        int x ; // 정수형 데이터를 위하여 변수 x를 준비해 주세요.
        int y ;
        int z ;

        x = 3 ; // x라는 곳에 숫자 3을 할당(대입)해주세요.(write)
        y = 5 ;
        z = x + y ; /* 이것은 여러줄에 걸쳐 주석을 작성할 때 사용합니다.
        여러 줄 주석은 '/*'로 시작하고, '/*'로 종료합니다.*/

        String message ; // 문자열 데이터를 위하여 변수 message 를 준비하세요.

        // + 기호의 2가지 역할 : (1) 뎃셈, (2) 문자열 결합
        message = x + " 더하기 " + y + "는(은) " + z + "입니다." ;
        System.out.println(message);

        x = 4 ; // 야 너 3이지, 없애고 4로 치환해
        y = 8 ;
        z = x * y ;

        message = x + " 곱하기 " + y + "은(는) " + z + "입니다." ;
        System.out.println(message);


    }
}
