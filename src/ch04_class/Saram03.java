package ch04_class;

public class Saram03 {
    private String name;
    private double height;
    private double weight; // private으로 지정된 변수는 해당 클래스 밖에서 지정 안됨;
    private String hobby;
    private String blood;

    public void setName(String name) { // set~는 대부분 쓰기작업
        this.name = name; // this.인스턴스변수 = 지역변수(구성요소);
        // this는 인스턴스변수에 붙히는 키워드;
        // this는 같은 이름의 인스턴스변수와 지역변수를 구별하기 위해 사용;

    }

    public String getName() { // get~은 대부분 읽기작업
        return name;
    }


    public void setHeight(double height) { // 반환타입 이름 (매개변수)
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}

