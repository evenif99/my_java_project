package ch05_package_inheritance.general.animalpkg01;

public class AnimalMain {
    public static void main(String[] args) {
        // 타입[] 배열명 = {}
        Animal01[] animal = {
            new GoldFish01("금붕어", 2, "거실 어항", 10, 2),
            new Lion01("라이언", 15,"세렝게티", 10, 4),
            new Eagle01("독수리", 20, "푸른 창공", 50, 2)
        };

        for (int i = 0; i < animal.length; i++) {
            animal[i].showInfo(); // 승급 시 서브클래스에 있는 메소드는 접근이 안되므로 해당 메소드는 무조건 슈퍼클래스에 존재함

            if(animal[i] instanceof GoldFish01){
                GoldFish01 goldFish01 = (GoldFish01) animal[i];
                goldFish01.swim();
            }

            if (animal[i] instanceof Lion01){
                Lion01 lion01 = (Lion01) animal[i];
                lion01.run();
            }

            if (animal[i] instanceof Eagle01){
                Eagle01 eagle01 = (Eagle01) animal[i];
                eagle01.fly();
            }
        }

    }
}