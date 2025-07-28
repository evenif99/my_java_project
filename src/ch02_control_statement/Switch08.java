package ch02_control_statement;

public class Switch08 {
    public static void main(String[] args) {
        int month =3 ;

        switch (month){
            case 3, 4, 5:
                System.out.println(month + "월은(는) 봄입니다");
                break;
            case 6, 7, 8:
                System.out.println(month + "월은(는) 여름입니다");
                break;
            case 9, 10, 11:
                System.out.println(month + "월은(는) 가을입니다");
                break;
            case 12, 1, 2:
                System.out.println(month + "월은(는) 겨울입니다");
                break;
            default:
                System.out.println("그외의 경우는 오류입니다");
        }
    }
}
