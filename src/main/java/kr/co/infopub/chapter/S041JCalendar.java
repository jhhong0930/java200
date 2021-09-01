package kr.co.infopub.chapter;

public class S041JCalendar {

    public static boolean isLeapYear(int year) {

        boolean isS = false;

        // 윤년 == 4의 배수이지만 100의 배수가 아니며 400의 배수
        if (((year % 4 == 0) && ((year & 100) != 0)) || (year % 400 == 0)) {
            isS = true;
        }

        return isS;
    }

    public static void main(String[] args) {

        System.out.println(isLeapYear(2017)); // false
        System.out.println(isLeapYear(2020)); // true
    }

}
