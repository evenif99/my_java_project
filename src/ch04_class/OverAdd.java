package ch04_class;

public class OverAdd {
    // 반환타입 이름(매개변수){ ... }
    int Add(int x, int y, int z){
        int result = 0;
        result = x + y + z;
        return result;
    }

    public void Add(int a, int b) {
        System.out.println("정수 덧셈 : " + (a + b));
    }

    public void Add(double x, double y) {
        System.out.println("실수 덧셈 : " + (x + y));
    }
    public void Add(int a, double x){ // a를 실수(double)로 암시적 형변환
        System.out.println("혼합 덧셈 : " + (a + x));
    }
}
