package kr.co.infopub.chapter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// foreach와 lambda 형식을 이용하여 List 출력하기
public class S057ForeachLambdaLotto {

    public static void main(String[] args) {

        List<Integer> mmlists = Arrays.asList(1, 6, 16, 22, 23, 33);

        mmlists.forEach(
                m -> { System.out.println(m + "\t"); }
        );

        System.out.println();

        Consumer<Integer> consume = (Integer m) -> { System.out.println(m + "\t"); };

        mmlists.forEach(consume);
    }

}
