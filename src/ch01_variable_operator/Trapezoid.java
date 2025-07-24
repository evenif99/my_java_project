package ch01_variable_operator;

public class Trapezoid {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 15;
        int x = (a+b)*c/2;

        System.out.println("밑변 : " + a);
        System.out.println("윗변 : " + b);
        System.out.println("높이 : " + c);
        System.out.println("면적 : " + x);
    }
}
