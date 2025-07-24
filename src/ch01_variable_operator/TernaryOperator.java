package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 5;
        int result = 0;
        result = a>=b ? a-b : b-a;
        System.out.println("절대 값 : " + result);

        int x = 5, y = 8;
        result = x<y ? x : y ;
        System.out.println("작은 값 : " + result);



        x = 5;
        y = 12;

        String str = y%x == 0 ? "yes" : "no";
        System.out.println("약수 : " + str);

        String message ;
        int su = 7 ;
        // 숫자 7은(는) 홀수입니다.
        String name = su%2 == 0 ? "짝수" : "홀수";
        message = "숫자 " + su + "은(는) " + name + " 입니다.";
        System.out.println(message);
        int score = 85 ; // 60점 이상이면 합격
        String scr = score >= 60 ? "합격" : "불합격";
        message = score + "점이므로 " + scr + " 입니다";
        System.out.println(message);
        // 85점이므로 합격입니다.
    }
}
