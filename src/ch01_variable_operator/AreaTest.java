package ch01_variable_operator;

public class AreaTest {
    public static void main(String[] args) {
        double x = 10.0;
        double y = 10.0;
        double z = 3.14;
        double a = (x*y*z);

        System.out.print("반지름이 " + x + "일 때");
        System.out.println("원의 면적은 " + a + "입니다");
    }
}
