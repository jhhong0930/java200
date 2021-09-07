package kr.co.infopub.chapter;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class S071SystemTest {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        System.out.println(time); // 1970.1.1 부터

        for (int i=0; i<100000; i++) {
            System.out.print("");
        }

        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time);

        System.out.println(time2 / 1000 / 60 / 60 / 24 / 365 + "년");

        Properties pro = System.getProperties();
        System.out.println(pro.getProperty("java.vm.version"));
        System.out.println(pro.getProperty("file.separator"));

        System.out.println(new Date(System.currentTimeMillis())); // 현재 시간

        Enumeration<Object> en = pro.keys();
        int i = 0;

        while (en.hasMoreElements()) {
            String keys = (String) en.nextElement();
            System.out.println((++i + " ") + keys + " : " + pro.getProperty(keys));
        }

    }

}
