package ch04_class;

public class Smartphone01 {

    String series;
    String processor;
    String memory;
    String display;
    String camera;
    String battery;
    String color;

    String showprocessorinfo(int gen){
        String proc = "";

        if (gen == 25){
            proc = "퀄컴 스냅드래곤 8 Elite for Galaxy Mobile Platform";
        }else if(gen ==24){
            proc = "퀄컴 스냅드래곤 8 Gen 3 for Galaxy Mobile Platform";
        }
        String message = series +"의 " + "processor :" + proc;
        return message;
    }

    String showmemoryinfo(int gen) {
        String mem = "";

        if (gen == 25) {
            mem = "12 GB LPDDR5X";
        }else if(gen ==24){
            mem = "12 GB LPDDR5X";
        }
        String message = series + "의 memory :" + mem;
        return message;
    }
    String showdisplayinfo(int gen){
        String dp = "";

        if (gen == 25){
            dp = "6.7인치 (169.1 mm)[1] 19.5:9 비율 3120 × 1440 Dynamic AMOLED 2X Infinity-O Display";
        }else if (gen == 24){
           dp ="6.8인치 (172.5 mm)[6] 19.5:9 비율 3120 × 1440 Dynamic AMOLED 2X Infinity-O Display";
        }
        String message = series + "의 display :" + dp;
        return message;
    }
    String showcamerainfo(int gen){
        String cam = "";

        if (gen == 25){
            cam = "전면 듀얼 픽셀 PDAF 지원 1,200만 화소 (ƒ/2.2 & 80°)";
        } else if (gen == 24){
            cam = "전면 듀얼픽셀 PDAF 지원 1,200만 화소 (ƒ/2.2 & 80°)";
        }
        String message = series + "의 camera: " + cam;
        return message ;
    }
    String showbatteryinfo(int gen){
        String bat = "";

        if (gen==25){
            bat = "내장형 Li-Ion 3,900 mAh";
        }else if (gen==24){
            bat = "내장형 Li-Ion 5,000 mAh";
        }
        String message = series + "의 배터리 : " + bat;
        return message;
    }
    String showcolorinfo(int gen){
        String col = "";

        if (gen ==25){
            col = "티타늄 제트블랙, 티타늄 아이스블루, 티타늄 실버";
        }else if (gen==24){
            col = "티타늄 블랙, 티타늄 옐로우, 티타늄 그레이, 티타늄 바이올렛, 티타늄 오렌지, 티타늄 블루, 티타늄 그린";
        }
        String message = series + "의 color : " + col;
        return message;
    }
    void spec(){
        System.out.println("시리즈 : " + series);
        System.out.println("프로세서 : " + processor);
        System.out.println("디스플레이: " + display);
        System.out.println("카메라 : " + camera);
        System.out.println("메모리 : " + memory);
        System.out.println("배터리 : " + battery);
        System.out.println("색상 : " + color);
    }


}
