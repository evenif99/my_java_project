package ch06_abstract_interface.cartest;

public class Grandeur extends Car{
    private double fuel; // 연비
    private String remark; // 연비에 대한 메모 (파생 변수로 적용)

    @Override
    public String toString() {
        String message = "연비 : " + fuel + "\n";
        message += "연비 메모 : " + remark;
        return super.toString() + message;
    }

    public Grandeur(String name, int price, Key key, double fuel) {
        super(name, price, key);
        this.fuel = fuel;

        if (this.fuel >= 20.0){
            this.remark = "excellent";
        }else if(this.fuel >= 15.0){
            this.remark = "good";
        }else{
            this.remark = "poor";
        }
    }

    @Override
    public void display() {
        double mileSpeed = super.speed / 1.6;

        String message = super.getName() + "의 현재 속도 :  " + mileSpeed + "mile 입니다.";
        System.out.println(message);
    }

    @Override
    public void speedUp(int speed) {
        super.speed += speed;
        super.speed = super.checkSpeed();
    }

    @Override
    public void speedDown(int speed) {
        super.speed -= speed < 0 ? -speed : speed;
    }
}
