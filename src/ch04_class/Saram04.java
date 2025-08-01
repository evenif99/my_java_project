package ch04_class;

import java.util.Scanner;

public class Saram04 { // 보이지 않는 "기본 생성자" 존재;
    // 생성자의 역할 : 객체의 상태를 초기화하는 것
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    Scanner scan = null; // 이런 변수가 있다고 선언
    // 지역변수 = 오토매틱 변수 -- 생성자에서 자동으로 생성되고 자동으로 제거되는 변수
    // 해당 변수들의 이름은 인스턴스 변수들과 동일하게 만드는 것을 추천
    public Saram04(String name, double height, double weight, String hobby, String blood){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
        this.scan = new Scanner(System.in);
    }
    public Saram04(String name, double height, double weight, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "볼링";
        this.blood = blood;
        this.scan = new Scanner(System.in);
    }

    // public 반환타입 이름(매개변수){ ... };
    // 생성자는 단 한번 호출되며, 목적은 인스턴스 변수를 초기화하기 위함이다;
    // 해당 구문은 생성자
    public Saram04() {
        this.name = "김철수";
        scan = new Scanner(System.in); // 해당 장치를 생성자에서 초기화 시킴
    }

    public void display() {
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("몸무게 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);

        if (scan == null) {
            System.out.println("정수 입력 : ");
            int su = this.scan.nextInt();
            System.out.println("입력된 정수 : " + su);
        }
    }
}
