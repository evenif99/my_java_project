package ch04_class;

public class SmartphoneMain01 {
    public static void main(String[] args) {
        Smartphone01 Galaxy_S25_Edge;
        Galaxy_S25_Edge = new Smartphone01();

        Smartphone01 Galaxy_S24_Ultra;
        Galaxy_S24_Ultra = new Smartphone01();

        System.out.println();

        String message = Galaxy_S25_Edge.showprocessorinfo(25);
        System.out.println(message);
        message = Galaxy_S25_Edge.showmemoryinfo(25);
        System.out.println(message);
        message = Galaxy_S25_Edge.showdisplayinfo(25);
        System.out.println(message);
        message = Galaxy_S25_Edge.showcamerainfo(25);
        System.out.println(message);
        message = Galaxy_S25_Edge.showbatteryinfo(25);
        System.out.println(message);
        message = Galaxy_S25_Edge.showcolorinfo(25);
        System.out.println(message);

        System.out.println();

        message = Galaxy_S24_Ultra.showprocessorinfo(24);
        System.out.println(message);
        message = Galaxy_S24_Ultra.showmemoryinfo(24);
        System.out.println(message);
        message = Galaxy_S24_Ultra.showdisplayinfo(24);
        System.out.println(message);
        message = Galaxy_S24_Ultra.showcamerainfo(24);
        System.out.println(message);
        message = Galaxy_S24_Ultra.showbatteryinfo(24);
        System.out.println(message);
        message = Galaxy_S24_Ultra.showcolorinfo(24);
        System.out.println(message);

        System.out.println();

        Galaxy_S25_Edge.spec(); //void 사용

        System.out.println();

        Galaxy_S24_Ultra.spec(); // void 사용

        System.out.println();

        Galaxy_S25_Edge.setSeries("갤럭시 S25 Edge");
        Galaxy_S25_Edge.setProcessor("퀄컴 스냅드래곤 8 Elite for Galaxy Mobile Platform");
        Galaxy_S25_Edge.setDisplay("6.7인치 (169.1 mm)[1] 19.5:9 비율 3120 × 1440 Dynamic AMOLED 2X Infinity-O Display");
        Galaxy_S25_Edge.setMemory("12 GB LPDDR5X SDRAM 9,600 MT/s + 256 / 512 GB UFS 4.0 내장 메모리");
        Galaxy_S25_Edge.setBattery("내장형 Li-Ion 3,900 mAh");
        Galaxy_S25_Edge.setCamera("전면 듀얼 픽셀 PDAF 지원 1,200만 화소 (ƒ/2.2 & 80°)");
        Galaxy_S25_Edge.setColor("티타늄 제트블랙, 티타늄 아이스블루, 티타늄 실버");

        System.out.println("시리즈 : " + Galaxy_S25_Edge.getSeries());
        System.out.println("프로세서 : " + Galaxy_S25_Edge.getProcessor());
        System.out.println("디스플레이 : " + Galaxy_S25_Edge.getDisplay());
        System.out.println("메모리 : " + Galaxy_S25_Edge.getMemory());
        System.out.println("배터리 : " + Galaxy_S25_Edge.getBattery());
        System.out.println("카메라 : " + Galaxy_S25_Edge.getCamera());
        System.out.println("색상 : " + Galaxy_S25_Edge.getColor());

        System.out.println();

        Galaxy_S24_Ultra.setSeries("갤럭시 S24 Ultra");
        Galaxy_S24_Ultra.setProcessor("퀄컴 스냅드래곤 8 Gen 3 for Galaxy Mobile Platform");
        Galaxy_S24_Ultra.setDisplay("6.8인치 (172.5 mm)[6] 19.5:9 비율 3120 × 1440 Dynamic AMOLED 2X Infinity-O Display");
        Galaxy_S24_Ultra.setMemory("12 GB LPDDR5X SDRAM 9,600 MT/s + 256 / 512 GB UFS 4.0 내장 메모리");
        Galaxy_S24_Ultra.setBattery("내장형 Li-Ion 5,000 mAh");
        Galaxy_S24_Ultra.setCamera("전면 듀얼 픽셀 PDAF 지원 1,200만 화소 (ƒ/2.2 & 80°)");
        Galaxy_S24_Ultra.setColor("티타늄 블랙, 티타늄 옐로우, 티타늄 그레이, 티타늄 바이올렛, 티타늄 오렌지, 티타늄 블루, 티타늄 그린");

        System.out.println("시리즈 : " + Galaxy_S24_Ultra.getSeries());
        System.out.println("프로세서 : " + Galaxy_S24_Ultra.getProcessor());
        System.out.println("디스플레이 : " + Galaxy_S24_Ultra.getDisplay());
        System.out.println("메모리 : " + Galaxy_S24_Ultra.getMemory());
        System.out.println("배터리 : " + Galaxy_S24_Ultra.getBattery());
        System.out.println("카메라 : " + Galaxy_S24_Ultra.getCamera());
        System.out.println("색상 : " + Galaxy_S24_Ultra.getColor());
    }






}
