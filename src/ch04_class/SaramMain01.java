package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {
        // 2단계 : 객체를 생성
        // 클래스이름 객체이름 = new 생성자이름() ; , 객체이름은 의미적절한 단어를 선정
        Saram01 yusin = new Saram01(); // 생성자이름은 클래스이름과 반드시 같아야 함

        Saram01 soon;
        soon = new Saram01(); // 일반적으로 많이 쓰는 객체생성 형식

        // 3단계 : 객체의 멤버 변수에 쓰기 작업
        // 점(.)을 멤버 참조 연산자라고 부릅니다.
        yusin.nationality = "대한 민국"; // 쓰기작업 -- 대한민국이라는 단어를 yusin.nationality에 대입
        yusin.name = "김유신";
        yusin.height = 172.5;
        yusin.weight = 75.0;
        yusin.hobby = "당구";
        yusin.blood = "AB";

        // 4단계 : 객체의 멤버 변수의 값을 출력 (읽기 작업)
        System.out.println("국적 : " + yusin.nationality);
        System.out.println("이름 : " + yusin.name);
        System.out.println("키 : " + yusin.height);
        System.out.println("몸무게 : " + yusin.weight);
        System.out.println("취미 : " + yusin.hobby);
        System.out.println("혈액형 : " + yusin.blood);

        System.out.println();

        soon.nationality = "대한 민국";
        soon.name = "유관순";
        soon.height = 168.5;
        soon.weight = 52.4;
        soon.hobby = "축구";
        soon.blood = "O";

        System.out.println("국적 : " + soon.nationality);
        System.out.println("이름 : " + soon.name);
        System.out.println("키 : " + soon.height);
        System.out.println("몸무게 : " + soon.weight);
        System.out.println("취미 : " + soon.hobby);
        System.out.println("혈액형 : " + soon.blood);

        System.out.println();

        String message = yusin.showGenderInfo(1);
        System.out.println(message);
        message = soon.showGenderInfo(2);
        System.out.println(message);

        System.out.println();

        message = yusin.showBmiInfo();
        System.out.println(message);

        message = soon.showBmiInfo();
        System.out.println(message);

        System.out.println();

        yusin.display();
        soon.display();
    }
}
