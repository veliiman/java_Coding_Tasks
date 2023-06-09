package week3;

public class ReverseNegativeNumber {
    public static int reverseNegative(int number) {
        boolean isNegative = number < 0;
        if (isNegative) {
            number *= -1;
        }

        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return isNegative ? -reversed : reversed;
    }

    public static void main(String[] args) {
        int number = -35;
        int reversedNumber = reverseNegative(number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
