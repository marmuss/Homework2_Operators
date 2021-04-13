import java.util.Scanner;

public class Homework2_Switch {

    public static void main(String[] args) {

        Scanner monthNumber = new Scanner(System.in);
        System.out.println("Введите номер месяца");

        int month = monthNumber.nextInt();

        switch (month) {
            case 12,1,2:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("В году всего 12 месяцев.");
        }
    }
}




