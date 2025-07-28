public class Exam4_18 {
    public static void main(String[] args) {
        int su = 7;
        for (int i = 1; i <= su ; i++) {
            String message = i + "의 제곱은 " + (i*i) + "입니다.";
            //문자열을 통해 결과를 도출해내는 능력을 기를 것
            System.out.println(message);
        }

        int total = 0;
        int su01 =3;
        int su02 =7;
        for (int i = su01; i <=su02 ; i++) {
            total += i;
        }
        System.out.println("합계 : " + total);
    }
}
