import java.util.Scanner;

public class Homework2_if_else_if {

    public static void main(String[] args) {

        Scanner monthNumber = new Scanner(System.in);
        System.out.println("Введите номер месяца");

        int month = monthNumber.nextInt();

       if(month <= 2 || month == 12){
           System.out.println("Зима");
       } else if (month <=5){
           System.out.println("Весна");
       } else if(month <= 8){
           System.out.println("Лето");
       } else if (month <= 11){
           System.out.println("Осень");
       } else {
           System.out.println("В году только 12 месяцев.");
       }
    }
}
