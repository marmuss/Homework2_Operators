import java.util.Scanner;

public class Homework2_Sum {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число");

        int sum = 0;
        int sumNumber = number.nextInt();
        for (;sumNumber > 0; sumNumber--){
            sum += sumNumber;
        }
        System.out.println("Сумма = " + sum);
    }
}
