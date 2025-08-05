package ch05_package_inheritance.general.mybeverage;

import java.lang.reflect.Array;

public class InheTest04 {
    public static void main(String[] args) {
        // 클래스이름 객체이름 = new 생성자이름();

        // 승급 : 서브클래스가 일시적으로 슈퍼클래스의 타입으로 변환이 되는 과정 (업캐스팅)
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250.0);

        // 슈퍼클래스 내에 있는 메소드는 상속 개념에 의하여 접근이 가능합니다
        beverage01.showInfo();

        // 승급시 서브클래스 내의 변수와 메소드는 일시적으로 접근을 하지 못하도록 설계되어 있습니다.
        // 단, 강등을 하게 되면 서브클래스 내의 변수와 메소드를 접근할 수 있습니다.
        Americano04 ame = (Americano04)beverage01; // 강등(다운캐스팅)
        // 강등구조: 서브클래스 객체이름 = (서브클래스) 승급된 객체이름
        ame.sipAmericano();

        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0, 2); // 승급
        beverage02.showInfo();
        Espresso04 esp = (Espresso04) beverage02; // 강등
        esp.drinkEspresso04();

        Beverage04 beverage03 = new Latte04("라떼" , 6000.0, "아몬드우유"); // 승급
        beverage03.showInfo();
        Latte04 latte = (Latte04) beverage03; // 강등

    }
}
