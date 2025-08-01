package ch04_class;

public class Smartphone02 {
    private String series;
    private String processor;
    private String memory;
    private String display;
    private String camera;
    private String battery = "내장형 Li-Ion 5,000 mAh"; // 기본값 구축
    private String color;

    public Smartphone02(String series, String processor, String memory, String display, String camera, String battery, String color) {
        this.series = series;
        this.processor = processor;
        this.memory = memory;
        this.display = display;
        this.camera = camera;
        this.battery = battery;
        this.color = color;
    }

    public Smartphone02(String series, String processor, String memory, String display, String camera, String color) {
        this.series = series;
        this.processor = processor;
        this.memory = memory;
        this.display = display;
        this.camera = camera;
        this.color = color;
    }

    public void display(){
        System.out.println("시리즈 : " + this.series);
        System.out.println("프로세서 : " + this.processor);
        System.out.println("메모리 : " + this.memory);
        System.out.println("디스플레이 : " + this.display);
        System.out.println("카메라 : " + this.camera);
        System.out.println("배터리 : " + this.battery);
        System.out.println("색상 : " + this.color);
        System.out.println();
    }
}
