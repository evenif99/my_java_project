package ch06_abstract_interface.beveragetest;

public class Americano extends Beverage{
    private double waterAmount;

    public Americano(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }

    @Override
    public String toString() {
        String message = "물의 양 : " + this.waterAmount;
        System.out.println(message);
        return super.toString() + message;
    }

    @Override
    public void drink() {
        System.out.println("아메리카노를(을) 홀짝 홀짝 마십니다.");
    }

    @Override
    public void leciepe() {
        System.out.println(super.getName() + "제조법");
    }

    @Override
    public void make() {
        System.out.println(super.getName() + " 1샷을   추출합니다");
        System.out.println("컵에 " + super.getName() + "를 넣고 뜨거운 물을 부어줍니다.");
        System.out.println(super.getName() + "를 먼저 넣고 물을 나중에 부으면 됩니다.");

    }
}
