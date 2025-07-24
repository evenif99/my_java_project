package ch01_variable_operator;

public class CondOper {
    public static void main(String[] args) {
        int x, y, z ;
        x = 13;
        y = 7;
        z = 8;
        int max = x > y ? x : y ;
        max = max > z ? max : z ;
        System.out.println("최대 정수 : " + max);

        int min = x < y ? x : y ;
        min = min < z ? min : z ;
        System.out.println("최소 정수: " + min);
    }
}
