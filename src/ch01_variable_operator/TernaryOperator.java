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

    }
}
