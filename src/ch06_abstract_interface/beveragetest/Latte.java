package ch06_abstract_interface.beveragetest;

public class Latte extends Beverage{
    private String milkType;

    public Latte(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    @Override
    public String toString() {
        String message = "우유 타입 : " + this.milkType;
        return super.toString() + message;
    }

    @Override
    public void drink() {
        System.out.println("부드럽고 크리미한 " + super.getName() + "를 마십니다.");
    }

    @Override
    public void leciepe() {
        System.out.println(super.getName() + "제조법");
    }

    @Override
    public void make() {
        System.out.println(super.getName() + " 1샷을 추출합니다.");
        System.out.println("컵에 " + super.getName() + "를 넣고 뜨거운 물을 부어줍니다.");
        System.out.println(super.getName() + "를 먼저 넣고 물을 나중에 부으면 됩니다.");
    }
}
