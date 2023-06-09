package week3;

public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return false;
            }else {
                return true;
            }
        }

        return true;


    }

    public static void main(String[] args) {
        int number = 18;
        if (isPrime(number)) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
}
