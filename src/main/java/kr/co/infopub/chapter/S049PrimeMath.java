package kr.co.infopub.chapter;

public class S049PrimeMath {

    public static boolean isPrime(int n) {

        boolean isS = true;

        for (int i=2; i<=(int)Math.sqrt(n); i++) {

            if (n % i == 0) {
                isS = false;
                break;
            }
            
        }

        return isS;
    }

    public static void main(String[] args) {

        int number = 1234567;

        if (isPrime(number)) {
            System.out.printf("%d is prime number", number);
        } else {
            System.out.printf("%d is not prime number", number);
        }

    }

}
