package kr.co.infopub.chapter;

import java.util.Iterator;
import java.util.Map;

public class S072SystemPropertyTest {

    public static void main(String[] args) {

        long nanotime = System.nanoTime();

        for (int i=0; i<100000; i++) {
            System.out.println("");
        }

        long nanotime2 = System.nanoTime();

        System.out.println(nanotime2 - nanotime);
        System.out.println(System.getenv("JAVA_HOME"));

        // 모든 env 구하기
        Map<String, String> map = System.getenv();
        Iterator<String> iter = map.keySet().iterator();

        int j = 0;

        while (iter.hasNext()) {
            String keys = iter.next();
            System.out.println((++j + " ") + keys + " : " + map.get(keys));
        }

    }

}
