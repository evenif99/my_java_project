package ch05_package_inheritance.general.mysports;

public class Sport {
    private String name; // 종목 이름
    private int entry;

    public Sport(String name, int entry) {
        this.name = name;
        this.entry = entry;
    }

    protected void printInfo() {
        System.out.println(name + "경기는 " + entry + "명의 엔트리로 구성됩니다.");
    }
}
