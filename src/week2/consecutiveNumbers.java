package week2;

import java.util.Scanner;

public class consecutiveNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i%5 == 0 && i%3 == 0 && i%2 ==0){
                System.out.print(" CodilityTestCoders ");
            }else if (i%5 == 0 && i%3 ==0) {
                System.out.print(" TestCoders ");
            }else if (i%5 == 0 && i%2 ==0) {
                System.out.print(" CodilityCoders ");
            } else if (i%3 == 0 && i%2 ==0) {
                System.out.print(" CodilityTest ");
            }else if (i%5 == 0 ) {
                System.out.print(" Coders ");
            }else if (i%3 == 0 ) {
                System.out.print(" Test ");
            }else if (i%2 == 0 ) {
                System.out.print(" Codility ");
            }else {
                System.out.print(i + " ");
            }

        }

            input.close();




    }
}
