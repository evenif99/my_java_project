package ch05_package_inheritance.general.mybeverage;

public class InheTest04 {
    public static void main(String[] args) {
        // 클래스이름 객체이름 = new 생성자이름();

        // 승급 : 서브클래스가 일시적으로 슈퍼클래스의 타입으로 변환이 되는 과정 (업캐스팅)
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250.0);

        // 슈퍼클래스 내에 있는 메소드는 상속 개념에 의하여 접근이 가능합니다
        beverage01.showInfo();

        System.out.println(beverage01.toString()); // toString : 해당 객체 정보를 문자열 형태로 출력


        // 승급시 서브클래스 내의 변수와 메소드는 일시적으로 접근을 하지 못하도록 설계되어 있습니다.
        // 단, 강등을 하게 되면 서브클래스 내의 변수와 메소드를 접근할 수 있습니다.
        Americano04 ame = (Americano04) beverage01; // 강등(다운캐스팅)
        // 강등구조: 서브클래스 객체이름 = (서브클래스) 승급된 객체이름
        ame.sipAmericano();

        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0, 2); // 승급
        beverage02.showInfo();
        Espresso04 esp = (Espresso04) beverage02; // 강등

        System.out.println(beverage02.toString());

        esp.drinkEspresso04();

        Beverage04 beverage03 = new Latte04("라떼", 6000.0, "아몬드우유"); // 승급
        beverage03.showInfo(); // Beverage04에 있는 showInfo라는 메소드를 실행하는 구문
        Latte04 latte = (Latte04) beverage03; // 강등

        System.out.println(beverage03.toString());

        latte.enjoyLatte();

        // 승급 개념과 배열을 같이 사용하기
        // 배열 초기화 기법 : 타입[](슈퍼클래스명) 배열이름 = {요소1, 요소2, ...}
        Beverage04[] beverage = {
            beverage01,  // 아메리카노
            new Espresso04("마이뿌레소", 2000.0, 1),
            new Latte04("바나나라떼", 3000.0, "바나나 우유")
        };

        for (int i = 0; i < beverage.length; i++) {
            System.out.println("--------------------------------");
            beverage[i].showInfo(); // 요소들의 메소드(showInfo)를 출력하는 메소드

            System.out.println(beverage[i].toString());

            //instanceof 문장의 결과값은 true/false인 boolean 값이므로 if문장 사용가능
            // beverage[i] instanceof Americano04
            // i번째 객체(인스턴스) instanceof 클래스 = i번째 인스턴스가 해당 클래스의 객체에 해당하는지 여부
            if(beverage[i] instanceof Americano04){
                Americano04 xxx = (Americano04) beverage[i];
                xxx.sipAmericano();
            }else if(beverage[i] instanceof Espresso04){
                Espresso04 yyy = (Espresso04) beverage[i];
                yyy.drinkEspresso04();
            }else if(beverage[i] instanceof Latte04){
                Latte04 zzz = (Latte04) beverage[i];
                zzz.enjoyLatte();
            }else {

            }
        }
    }
}
