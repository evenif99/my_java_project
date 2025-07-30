package ch04_class;

public class SmartphoneMain01 {
    public static void main(String[] args) {
        Smartphone01 Galaxy_S25_Edge;
        Galaxy_S25_Edge = new Smartphone01();

        Smartphone01 Galaxy_S24_Ultra;
        Galaxy_S24_Ultra = new Smartphone01();

        Galaxy_S25_Edge.series = "갤럭시 S25 엣지";
        Galaxy_S25_Edge.processor = "퀄컴 스냅드래곤 8 Elite for Galaxy Mobile Platform";
        Galaxy_S25_Edge.memory = "12 GB LPDDR5X SDRAM 9,600 MT/s" +
                "256 / 512 GB UFS 4.0 내장 메모리";
        Galaxy_S25_Edge.display = "6.7인치 (169.1 mm)[1] 19.5:9 비율 3120 × 1440 Dynamic AMOLED 2X Infinity-O Display";
        Galaxy_S25_Edge.camera = "전면 듀얼 픽셀 PDAF 지원 1,200만 화소 (ƒ/2.2 & 80°)";
        Galaxy_S25_Edge.battery = "내장형 Li-Ion 3,900 mAh";
        Galaxy_S25_Edge.color = "티타늄 제트블랙, 티타늄 아이스블루, 티타늄 실버";

        Galaxy_S24_Ultra.series = "갤럭시 S24 울트라";
        Galaxy_S24_Ultra.processor = "퀄컴 스냅드래곤 8 Gen 3 for Galaxy Mobile Platform";
        Galaxy_S24_Ultra.memory = "12 GB LPDDR5X SDRAM 8,533 MT/s" +
                "256 / 512 GB / 1 TB UFS 4.0 규격 내장 메모리";
        Galaxy_S24_Ultra.display = "6.8인치 (172.5 mm)[6] 19.5:9 비율 3120 × 1440 Dynamic AMOLED 2X Infinity-O Display";
        Galaxy_S24_Ultra.camera = "전면 듀얼픽셀 PDAF 지원 1,200만 화소 (ƒ/2.2 & 80°)";
        Galaxy_S24_Ultra.battery = "내장형 Li-Ion 5,000 mAh";
        Galaxy_S24_Ultra.color = "티타늄 블랙, 티타늄 옐로우, 티타늄 그레이, 티타늄 바이올렛, 티타늄 오렌지, 티타늄 블루, 티타늄 그린";

        System.out.println("디스플레이 :" + Galaxy_S25_Edge.display);
        System.out.println("프로세서 :" + Galaxy_S25_Edge.processor);
        System.out.println("메모리 :" + Galaxy_S25_Edge.memory);
        System.out.println("카메라 :" + Galaxy_S25_Edge.camera);
        System.out.println("배터리 :" + Galaxy_S25_Edge.battery);
        System.out.println("색상 :" + Galaxy_S25_Edge.color);

        System.out.println();

        System.out.println("디스플레이 :" + Galaxy_S24_Ultra.display);
        System.out.println("프로세서 :" + Galaxy_S24_Ultra.processor);
        System.out.println("메모리 :" + Galaxy_S24_Ultra.memory);
        System.out.println("카메라 :" + Galaxy_S24_Ultra.camera);
        System.out.println("배터리 :" + Galaxy_S24_Ultra.battery);
        System.out.println("색상 :" + Galaxy_S24_Ultra.color);

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
    }


}
