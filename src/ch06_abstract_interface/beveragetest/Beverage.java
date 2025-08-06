package ch06_abstract_interface.beveragetest;

public abstract class Beverage {
    private String name;
    private double price;

    @Override
    public String toString() {
        String message = "이름 : " + this.name;
        System.out.println(message);
        return super.toString() + message;
    }

    public String getName() {
        return name;
    }

    public Beverage() {
    }
    public abstract void drink();
    public abstract void leciepe();

    public abstract void make();
    protected final void showData() {
        System.out.println("음료 " + this.name + "의 단가는 " + this.price + "입니다.");
    }
    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

