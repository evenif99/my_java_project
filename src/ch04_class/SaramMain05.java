package ch04_class;

public class SaramMain05 {
    public static void main(String[] args) {
        // 타입[] 배열명 = new 타입[요소개수];
        int[] arr = new int[3];
        Saram05[] saram = new Saram05[2]; // 배열정의

        saram[0] = new Saram05("이순신", 180.5, 75.0, "농구", "AB"); // 0번째 객체 생성
        // 타입[요소] = new 생성자();
        saram[1] = new Saram05("김유신", 180.2, 70.0, "O");

        for (int i = 0; i < saram.length; i++) {
            saram[i].display();
        }
        // 배열(array) 안쪽의 초기화 기법
        Saram05[] mylist = {
                new Saram05("박영희", 150.5, 55.0, "수영", "B"),
                new Saram05("최진철", 180.2, 66.0, "A")
        };

        for (int i = 0; i < mylist.length; i++) {
            mylist[i].display();
        }
    }
}
