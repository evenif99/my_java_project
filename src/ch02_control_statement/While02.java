package ch02_control_statement;

public class While02 {
    public static void main(String[] args) {
        int i =1;
        int odd =0;
        int even =0;
        while (i<=10){

            if (i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
            i++; // 🔴 반드시 필요: i 값을 증가시켜야 조건이 거짓이 되어 루프를 종료할 수 있음 (증감식을 반드시 넣을 것)
        }
        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);

        even=0;
        odd=0;
        for (int j = 0; j <10 ; j+=2) {
            even+=j;
        }
        for (int j = 1; j <11 ; j+=2) {
            odd+=j;
        }
        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);
    }
}
