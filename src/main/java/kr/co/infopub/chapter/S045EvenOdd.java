package kr.co.infopub.chapter;

public class S045EvenOdd {

    public static void showOddnEvenf(int n) {

        int temp = n;

        // for(초기값; 조건; 스텝)
        // 조건을 명시하지 않으면 for(; true;) == while(true)
        // 초기값, 스텝이 없으면 while(조건)과 동일
        for (; temp!=1; ) { // while(temp != 1)

            if (temp % 2 == 1) {
                temp = temp * 3 + 1;
            } else {
                temp /= 2;
            }

            System.out.println("[" + temp + "]");
        }

        System.out.println("\n----------------");
    }

    public static void main(String[] args) {

        showOddnEvenf(122);
    }

}
