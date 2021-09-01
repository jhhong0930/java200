package kr.co.infopub.chapter;

public class S043EvenOdd {

    public static void showOddnEvenw(int n) {

        int temp = n;

        // "1씩 증가" 처럼 증감값이 명확활 때는 for, 끝나는 조건이 명확할 때는 while 사용
        while (temp != 1) {

            if (temp % 2 == 1) { // 홀수면 3배한 값에 1 더하기
                temp = temp * 3 + 1;
            } else { // 짝수면 2로 나누기
                temp /= 2;
            }

            System.out.println("[" + temp + "]");
        }

        System.out.println("\n----------------");
    }

    public static void main(String[] args) {

        showOddnEvenw(122);
    }

}
