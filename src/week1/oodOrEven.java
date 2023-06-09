package week1;

import java.util.Scanner;

public class oodOrEven {

    public static void OddOrEven(int num){


        if ((num %2) ==0 ){
            System.out.println(num + " is odd number.");
        }else {
            System.out.println(num + " is even number.");
        }
    }



    public static void main(String[] args) {

        OddOrEven(53);



    }
}
