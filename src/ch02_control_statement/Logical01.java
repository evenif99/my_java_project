package ch02_control_statement;

public class Logical01 {
    public static void main(String[] args) {
        int season = 10;
        if (season>=3 && season<=5) {
            System.out.println("봄");
        }else if (season>=6 && season <=8){
            System.out.println("여름");
        }else if (season>=9 && season<=11){
            System.out.println("가을");
        } else{
            System.out.println("겨울");
        }
    }
}
