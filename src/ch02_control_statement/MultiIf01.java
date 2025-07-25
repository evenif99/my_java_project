package ch02_control_statement;

public class MultiIf01 {
    public static void main(String[] args) {
        int temperature = 24;
        String 날씨 ;
        String message ;
        if (temperature>=35) {
            날씨 = "폭염 경보";
        }else if (temperature>=30){
            날씨 = "무더운 날씨";
        }else if (temperature>=20){
            날씨 = "쾌적한 날씨";
        }else if (temperature>=10){
            날씨 = "쌀쌀한 날씨";
        }else{
            날씨 = "추운 날씨";
        }
        message = temperature + "도는 " + 날씨 + "입니다.";
        System.out.println(message);
    }
}
