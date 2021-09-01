package kr.co.infopub.chapter;

public class S046BioRandom {

    public static void main(String[] args) {

        int range = 9;
        int start = 1;
        int a, b, c = 0;

        while (true) {

            a = (int)(range * Math.random() + start);
            b = (int)(range * Math.random() + start);
            c = (int)(range * Math.random() + start);

            if (a != b && b != c && c != a) break;
        }

        System.out.printf("%d\t%d\t%d", a, b, c);
    }

}
