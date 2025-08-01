package ch04_class;

// 1단계 : 클래스 정의(선언) -- 변수가 몇개인지, 변수의 타입은 무엇인지를 파악하는 것이 중요
// 클래스 : 객체를 만들어 내기 위한 템플릿
public class Saram01 {
    // 공유하고자 하는 변수는 static 키워드를 사용합니다.
    static String nationality ;
    // 멤버 변수들은 기본 값이 존재합니다.

    String name;
    String hobby;
    String blood;
    double height;
    double weight;

    // 반환타입 메소드이름(매개변수 타입과 이름){ ... } 매개변수는 지역변수의 부분합
    String showGenderInfo(int juminno){
        String gender = "" ;

        if (juminno == 1 || juminno == 3){
            gender = "남자";
        }else{
            gender = "여자";
        }

        String message = name + "님은 "+ gender + "입니다." ;

        return message ;
        }

    String showBmiInfo(){
        double newHeight = height/100.0 ; // cm 을 m로 변환
        double rate = weight / (newHeight*newHeight); // bmi 공식에 의하여 계산
        String bmi = ""; // 결과를 저장할 문자열
        if (rate >= 25.00) {
            bmi = "비만";
        }else if (rate >= 23.00){
            bmi = "과체중";
        } else if (rate >= 18.50) {
            bmi = "정상";
        }else {
            bmi = "저체중";
        }

        String message = name + "님은 " + bmi + "입니다.";
        return message ;
    }
    // 반환 타입  메소드이름(매개 변수 리스트){ ... }
    void display() {               // void는 반환하지 않을 경우 사용, return 사용안함
        System.out.println(name + "님의 신상정보");
        System.out.println("국적 : " + nationality); // static 변수는 기울어져있음
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height + "cm");
    }
}