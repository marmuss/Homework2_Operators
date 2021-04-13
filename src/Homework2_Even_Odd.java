import java.util.Scanner;

public class Homework2_Even_Odd {

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Введите число");

       int number = inputNumber.nextInt();

        if (number%2 == 0){
            System.out.println("Это число четное");
        } else {
            System.out.println("Это число нечетное");
        }
    }
}
