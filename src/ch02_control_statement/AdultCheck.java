package ch02_control_statement;

public class AdultCheck {
    public static void main(String[] args) {
        String name = "홍길동" ; // 이름
        int age = 25 ; // 나이
        int _gender =4; // 주민번호 뒷자리 성별
        String gender ; // 성별(한글)
        String adult ; // 미성년자 여부 문자열

        System.out.println("이름 : " + name);
        if (age >= 19){
            adult = "성인";
        }else{
            adult = "미성년자";
        }
        if (_gender ==1 || _gender ==3){
            gender = "남성";
        }else{
            gender = "여성";
        }
        String message ;
        message = "이름: " + name + "님, " + "나이 : " + age + ", 성인 체크 : " + adult + ", 성별 : " + gender ;
        System.out.println(message);
        }
    }

