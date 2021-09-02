package kr.co.infopub.chapter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class S060ForLambdaCondition {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        int s = 0;

        for (int i=1; i<=10; i++) {
            list.add(i);
        }

        list = list.stream()
                .filter(i -> i % 2 == 1)       // 조건에 맞는 값 검색
                .map(i -> i * i)               // 처리
                .collect(Collectors.toList()); // 처리된 값을 새로운 리스트에 저장

        list.forEach(i -> {
            System.out.println(i + "\t");
        });

        System.out.println();

        s = list.stream().reduce(0, Integer::sum);
        System.out.println("1 ~ 10 사이의 홀수에 대한 제곱 합: " + s);
    }

}
