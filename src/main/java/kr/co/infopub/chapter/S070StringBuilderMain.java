package kr.co.infopub.chapter;

public class S070StringBuilderMain {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("I")
                .append(" go")
                .append(" to school.");

        System.out.println(sb);

        sb.replace(7, 11, "");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);

        sb.delete(1, 3);
        System.out.println(sb);

        String ss = sb.substring(0);
        System.out.println(ss);
        System.out.println(sb);

        String st = sb.substring(0, 4);
        System.out.println(st);
        System.out.println(sb);
    }

}
