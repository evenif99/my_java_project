package ch05_package_inheritance.general;

// 하위 클래스 (subclass)
// "subclass" extends "superclass"
public class Americano03 extends Beverage03 {
    private  double waterAmount; // 투입하는 물의 양

    public Americano03(String name, double price, double waterAmount) {
        //super(); // 부모님의 생성자 호출
        super(name, price);
        this.waterAmount = waterAmount;
        //waterAmount가 지역변수 이기 때문에 this.~로 인스턴스변수에 할당하는 과정
    }

    public void printInfo() {
        super.showInfo(); // 부모클래스에서 할당한 메소드(showInfo)를 가져오는 작업
        System.out.println("투입된 물의 양 : " + this.waterAmount + "ml");
        System.out.println();
    }
}
