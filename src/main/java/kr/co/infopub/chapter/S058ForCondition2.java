package kr.co.infopub.chapter;

import java.util.ArrayList;
import java.util.List;

public class S058ForCondition2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        int s = 0;

        for (int i=1; i<=10; i++) {
            list.add(i);
        }

        for (int m : list) {
            if (m % 2 == 1) {
                s += m * m;
                System.out.printf("%d\t", m * m);
            }
        }

        System.out.println();
        System.out.println("1 ~ 10 사이의 홀수에 대한 제곱 합: " + s);
    }

}
