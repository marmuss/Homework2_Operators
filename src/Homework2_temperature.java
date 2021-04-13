import java.util.Scanner;

public class Homework2_temperature {

    public static void main(String[] args) {

        Scanner inputTemperature = new Scanner(System.in);
        System.out.println("Какая сегодня температура?");

        int temperature = inputTemperature.nextInt();

        if (temperature > -5){
            System.out.println("Тепло");
        } else if (temperature <= -20){
            System.out.println("Холодно");
        } else {
            System.out.println("Нормально");
        }
    }
}
