package ch03_array;

public class MyArr01 {
    public static void main(String[] args) {
        // 정수 데이터 25개를 취급하기 위한 배열 선언
        // int[] jumsu = new int[25];

        int x = 3;
        int y = 5;

        // 정수 데이터 3개를 취급하기 위한 배열 arr 선언
        int[] arr = new int[3]; //배열의 대괄호 안은 숫자 0부터 시작한다. (zero base)

        arr[0] = x - y + 6; // 4

        arr[2] = arr[0] + 3; // 7

        arr[1] = arr[0] + arr[2]; // 11

        System.out.println("요소를 출력");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        //배열이 나오면 대부분 for문장을 사용한다.
        //배열이름 뒤에 length를 붙히면 배열의 크기를 자동으로 적용시켜준다.
        }

        System.out.println("배열 초기화 기법");
        int[] arr2 = {50, 20, 30}; // 초기화 기법

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }


    }
}
