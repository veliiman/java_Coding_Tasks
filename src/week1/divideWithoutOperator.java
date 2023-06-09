package week1;

public class divideWithoutOperator {

    public static void DivideWithoutOperator(int num1, int num2){

       int count = 0;

        while (num1 >= num2){
            num1 -= num2;
            count ++;

        }
        System.out.println(count);



    }



    public static void main(String[] args) {

        DivideWithoutOperator(125,7);



    }
}
