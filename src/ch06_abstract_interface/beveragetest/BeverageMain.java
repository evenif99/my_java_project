package ch06_abstract_interface.beveragetest;

public class BeverageMain {
    public static void main(String[] args) {
        Beverage[] beverage = {
            new Americano("아메리카노", 4000.0, 250.0),
            new Espresso("마이뿌레소", 2000.0, 1),
            new Latte("라떼", 3000.0, "바나나 우유")
        };

        for (int i = 0; i < beverage.length; i++) {
            if (i == 0){
                beverage[i].showData();
                beverage[i].drink();
                beverage[i].leciepe();
                Beverage amc = new Americano("에스프레소", 4000.0, 250.0);
                amc.make();
                amc.toString();
                System.out.println("---------------------");
            } else if (i == 1) {
                beverage[i].showData();
                beverage[i].drink();
                beverage[i].leciepe();
                Beverage myp = new Espresso("에스프레소", 2000.0, 1);
                myp.make();
                System.out.println("---------------------");
            }else {
                beverage[i].showData();
                beverage[i].drink();
                beverage[i].leciepe();
                Beverage myp = new Latte("에스프레소", 3000.0, "바나나우유");
                myp.make();
            }
        }

    }
}
